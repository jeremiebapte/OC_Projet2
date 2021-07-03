package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TriSymptoms {

    public Map<String,Integer> sortSymptoms(Map<String,Integer> symptoms) {
        return new TreeMap<>(symptoms);
    }
}
