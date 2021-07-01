package com.hemebiotech.analytics;

import java.util.List;

public class ReaderSymptoms {

    public List<String> readSymptoms(){
        ISymptomReader file = new ReadSymptomDataFromFile("symptoms.txt");

        List<String> symptomsFile = file.getSymptoms();
        return symptomsFile;
    }
}
