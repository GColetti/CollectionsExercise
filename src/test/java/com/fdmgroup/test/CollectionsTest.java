package com.fdmgroup.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.Color;

import com.fdmgroup.main.CollectionsExercise;

class CollectionsTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	@DisplayName("Test 1")
	void test_1() {
		// Arrange
		Set<String> expectedFirstNames = new HashSet<String>();
		expectedFirstNames.add("Gianluca");
		expectedFirstNames.add("David");

		// Act
		Set<String> actualFirstNames = new HashSet<String>();
		actualFirstNames = CollectionsExercise.removeDuplicates("David", "David", "Gianluca");

		// Assert
		assertEquals(expectedFirstNames, actualFirstNames);
	}

	@Test
	@DisplayName("Test 2")
	void test_2() {
		// Arrange
		Map<String, Color> actualColors;

		// Act
		actualColors = CollectionsExercise.getColors();

		// Assert
		assertNotNull(actualColors);
	}

	@Test
	@DisplayName("Test 3")
	void test_3() {
		// Arrange
		Map<Character, Integer> letters;

		// Act
		letters = CollectionsExercise.countLetters("HELLO THERE");

		// Assert
		assertEquals(7, letters.size());
	}

	@Test
	@DisplayName("Test 4")
	void test_4() {
		// Arrange
		int duplicateWordsCount;

		// Act
		duplicateWordsCount = CollectionsExercise.countDuplicateWords("The the THE dog is brown BrOwN.");

		// Assert
		assertEquals(2, duplicateWordsCount);
	}

	@Test
	@DisplayName("Test 5")
	void test_5() {
		// Arrange
		LinkedList<Object> actualList = new LinkedList<Object>(Arrays.asList(1, 2, 3));

		// Act
		LinkedList<Object> expectedList = CollectionsExercise.reverseList(actualList);

		// Assert
		assertEquals(actualList.getFirst(), expectedList.getLast());
	}

	@Test
	@DisplayName("Test 6")
	void test_6() {
		// Arrange
		TreeSet<String> treeSet = new TreeSet<String>();

		// Act
		treeSet = CollectionsExercise.tokenizeString("The the THE dog is brown BrOwN.");
		
		// Assert
		assertNotNull(treeSet);
	}
}
