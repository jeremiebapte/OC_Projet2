package com.hemebiotech.analytics;

import java.util.List;

public class ReaderSymptom {
    /* Lecture fichier symptomes
     *Mise en Liste
     */
    public List<String> readSymptoms(){
        ISymptomReader file = new ReadSymptomDataFromFile("symptoms.txt");

        List<String> symptomsFile = file.GetSymptoms();
        return symptomsFile;
    }
}