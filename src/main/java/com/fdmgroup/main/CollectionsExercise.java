package com.fdmgroup.main;

import java.awt.Color;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsExercise {

	public static void main(String[] args) {
	}

	public static Set<String> removeDuplicates(String... names) {
		Set<String> namesSet = new HashSet<String>();
		for (String name : names) {
			namesSet.add(name);
		}
		return namesSet;
	}

	public static Map<String, Color> getColors() {
		Map<String, Color> colorSet = new HashMap<String, Color>();

		colorSet.put("Black", Color.BLACK);
		colorSet.put("Blue", Color.BLUE);
		colorSet.put("Cyan", Color.CYAN);
		colorSet.put("Dark Gray", Color.DARK_GRAY);
		colorSet.put("Gray", Color.GRAY);
		colorSet.put("Light Gray", Color.LIGHT_GRAY);
		colorSet.put("Magenta", Color.MAGENTA);
		colorSet.put("Orange", Color.ORANGE);
		colorSet.put("Pink", Color.PINK);
		colorSet.put("Red", Color.RED);
		colorSet.put("White", Color.WHITE);
		colorSet.put("Yellow", Color.YELLOW);

		return colorSet;
	}

	public static Map<Character, Integer> countLetters(String string) {
		Map<Character, Integer> letters = new HashMap<Character, Integer>();
		for (int i = 0; i < string.length(); i++) {
			if (letters.containsKey(string.charAt(i))) {
				letters.put(string.charAt(i), letters.getOrDefault(string.charAt(i), 0) + 1);
			} else {
				letters.put(string.charAt(i), 1);
			}
		}

		return letters;
	}

	public static int countDuplicateWords(String string) {
		Map<String, Integer> duplicateWords = new HashMap<String, Integer>();
		int count = 0;

		String[] words = string.toLowerCase().split("\\s+");

		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].replaceAll("[^\\w]", "");
		}

		for (String word : words) {
			if (duplicateWords.containsKey(word)) {
				duplicateWords.put(word, duplicateWords.getOrDefault(word, 0) + 1);
			} else {
				duplicateWords.put(word, 1);
			}
		}

		Collection<Integer> wordCounts = duplicateWords.values();

		for (Integer i : wordCounts) {
			if (i > 1) {
				count++;
			}
		}

		return count;
	}

	public static LinkedList<Object> reverseList(LinkedList<Object> llist) {
		LinkedList<Object> reverseList = new LinkedList<Object>();

		for (int i = llist.size() - 1; i >= 0; i--) {

			// Append the elements in reverse order
			reverseList.add(llist.get(i));
		}
		// Return the reversed arraylist
		return reverseList;

	}

	public static TreeSet<String> tokenizeString(String string) {
		String[] words = string.toLowerCase().split("\\s+");

		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].replaceAll("[^\\w]", "");
		}
		
		TreeSet<String> tokenTreeSet = new TreeSet<String>(Arrays.asList(words));
		return tokenTreeSet;
	}

}
