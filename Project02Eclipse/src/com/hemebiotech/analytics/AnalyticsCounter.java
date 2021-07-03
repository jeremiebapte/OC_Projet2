package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.*;

public class AnalyticsCounter {

	/* TreeMap avec symptomes triés.
	 * Affichage console.
	 *
	 * */


	public static void main(String[] args) throws IOException {

		ReaderSymptom finalReader = new ReaderSymptom();
		List<String> finalSymptoms = finalReader.readSymptoms();

		CountSymptoms finalCount = new CountSymptoms();
		Map<String,Integer> countedSymptoms = finalCount.countingSymptomsData(finalSymptoms);

		TriSymptoms finalSort = new TriSymptoms();
		Map<String,Integer> sortedSymptoms = finalSort.sortSymptoms(countedSymptoms);

		ISymptomsWriter finalResult = new WriteSymptoms();
		finalResult.writeSymptomsData(sortedSymptoms);



		for (Map.Entry<String, Integer> entree : sortedSymptoms.entrySet())
			System.out.println("Symptoms : " + entree.getKey() + ": " +entree.getValue());


	}

}
