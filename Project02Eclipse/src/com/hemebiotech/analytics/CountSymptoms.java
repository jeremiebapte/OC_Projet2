package com.hemebiotech.analytics;

import java.util.*;

public class CountSymptoms {

    /*
     * Counting of symptoms.
     * Map setting
     *
     */
    public Map<String, Integer> countingSymptomsData(List<String> symptomsFile) {



        Map<String, Integer> symptomsTri = new HashMap<>();
        for (String listSymptoms : symptomsFile) {
            if (symptomsTri.containsKey(listSymptoms)) {
                symptomsTri.put(listSymptoms, symptomsTri.get(listSymptoms) + 1);
            } else {
                symptomsTri.put(listSymptoms, 1);
            }

        }
        return symptomsTri;
    }
}
