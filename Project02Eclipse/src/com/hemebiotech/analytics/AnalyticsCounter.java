package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.*;

public class AnalyticsCounter {

	/* TreeMap avec symptomes triés.
	 * Affichage console.
	 *
	 * */


	public static void main(String[] args) throws IOException {

		ReaderSymptoms finalReader = new ReaderSymptoms();
		List<String> finalSymptoms = finalReader.readSymptoms();

		CountSymptoms finalCount = new CountSymptoms();
		Map<String,Integer> countedSymptoms = finalCount.countingSymptomsData(finalSymptoms);

		TriSymptoms finalSort = new TriSymptoms();
		Map<String,Integer> sortedSymptoms = finalSort.sortSymptoms(countedSymptoms);

		ISymptomWriter finalResult = new WriteSymptoms();
		finalResult.writeSymptomsData(sortedSymptoms);



		for (Map.Entry<String, Integer> entree : sortedSymptoms.entrySet())
			System.out.println("Symptoms : " + entree.getKey() + ": " +entree.getValue());


	}

}







