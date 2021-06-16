package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;

public class WriteSymptoms {
    public class FileWriterData {

        public void writeSymptomsData() throws IOException {
            try {

                TriSymptoms symptomsTri = new TriSymptoms();
                FileWriter writer = new FileWriter("result.out");
                writer.write("Symptoms List " + symptomsTri);
                writer.close();

            } catch (IOException e) {
                e.printStackTrace();

            }

        }

    }
}
