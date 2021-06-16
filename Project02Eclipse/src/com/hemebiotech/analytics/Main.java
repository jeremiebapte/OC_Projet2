package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

    public class Main {
    public static void main(String[] args) {
        AnalyticsCounter test = new AnalyticsCounter();
        List<String> resultat = test.lecture();
        Collections.sort(resultat);
        System.out.println(resultat);
        System.out.println(resultat.size());
    }


    public static void tri(String[] args){
        AnalyticsCounter test = new AnalyticsCounter();
        List<String> resultat = test.lecture();
        Collections.sort(resultat);
        System.out.println(resultat);


    }


}



