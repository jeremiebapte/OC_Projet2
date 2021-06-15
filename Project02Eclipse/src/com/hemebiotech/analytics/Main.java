package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnalyticsCounter test = new AnalyticsCounter();
        List<String> resultat = test.lecture();
        System.out.println(resultat.size());
        Collections.sort(resultat);
        System.out.println(resultat);




        }
    }


