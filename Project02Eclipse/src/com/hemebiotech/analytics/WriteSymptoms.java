package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WriteSymptoms implements ISymptomsWriter {
    /*
     *sort and write in the result.out file
     * management of possible errors
     * */
    @Override
    public void writeSymptomsData(Map<String,Integer> sortingSymptomsData) {

        FileWriter writer = null;
        try {


            writer = new FileWriter("result.out");
            for (Map.Entry<String, Integer> entree : sortingSymptomsData.entrySet()){
                writer.write(entree.getKey() + " : " + entree.getValue() + "\n");
            }
            writer.close();

        } catch (IOException e) {
            System.out.println("Erreur lors de l'écriture du fichier");

        }finally {
            if(writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Erreur lors de la fermeture du fichier");
                }
            }
        }

    }

}