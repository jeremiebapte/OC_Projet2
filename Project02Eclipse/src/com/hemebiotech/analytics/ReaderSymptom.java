package com.hemebiotech.analytics;

import java.util.List;

public class ReaderSymptom {
    /*
     *Reading symptom file
     * Listing
     */
    public List<String> readSymptoms(){
        ISymptomReader file = new ReadSymptomDataFromFile("symptoms.txt");

        List<String> symptomsFile = file.GetSymptoms();
        return symptomsFile;
    }
}