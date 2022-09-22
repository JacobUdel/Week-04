import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LabWork {

	public static void main(String[] args) {
		// Lab part 1
		// StringBuilder has better memory mgmt than a String
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <10; i++) {
			if (i != 9) {
				sb.append(i + "-");
			} else {
				sb.append(i);
			}
		}
		System.out.println(sb.toString());
		
		List<String> strings = new ArrayList<String>();
		strings.add("Tom");
		strings.add("Sammy");
		strings.add("Paul");
		strings.add("I");
		strings.add("Me");
		
		System.out.println(findShortestString(strings));
		
		List<String> swapped = swapFirstAndLast(strings);
		for (String string : swapped) {
			System.out.println(string);
		}
		
		System.out.println(combineStrings(swapped));
		
		//Lab part 2
		List<String> searchResults = search(strings, "a");
		for (String result : searchResults) {
			System.out.println(result);
		}
		
		List<Integer> numbers = Arrays.asList(1,2,3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 16, 20, 25, 30);
		List<List<Integer>> sortedNumbers = sortDivisibleNumbers(numbers);
		for (List<Integer> list : sortedNumbers) {
			for (Integer number : list) {
				System.out.println(number);
			}
			System.out.println("Next List");
			
			List<Integer> stringsLengths = caculateStringLengths(strings);
			for (Integer i : stringsLengths) {
				System.out.println(i);
			}
		}
		
		Set<String> set = new HashSet<String>();
		set.add("Hello");
		set.add("World");
		set.add("Goodbye");
		set.add("Hi");
		set.add("Hello again");
		
		Set<String> startsWithH = findAllThatStartWith(set, 'H');
		for (String word : startsWithH) {
			System.out.println(word);
		}
		
		List<String> resultList = convertSetToList(set);
		for (String listString : resultList) {
			System.out.println(listString);
		}
		
		//lab part 3
		Set<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(3);
		integerSet.add(4);
		integerSet.add(8);
		integerSet.add(33);
		Set<Integer> setOfEvens = extractEvens(integerSet);
		for (Integer number : setOfEvens) {
			System.out.println(number);
		}
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Apple", "A crunchy fruit, usually red, green, or yellow.");
		dictionary.put("Banana", "A yellow fruit which you peel before eating.");
		dictionary.put("Java", "A programming language created in 1995.");
		System.out.println(getDefination(dictionary, "Apple"));
		
		Map<Character, Integer> counts = countStartingLetters(resultList);
		for (Character character : counts.keySet()) {
			System.out.println(character + " - " + counts.get(character));
		}
		// external homework
		int endNum = 10;
		List<Integer> listOfIntegers = new ArrayList<Integer>();
		if (endNum > 0) {
			for (int i = 0; i < endNum; i++) {
				listOfIntegers.add(i + 1);
			}
			System.out.println("The first number in the List is " + listOfIntegers.get(0));
			System.out.println("The last number in the List is " + listOfIntegers.get(endNum -1));
		} else {
			System.out.println("endNum can not be less than 1");
		}
		
		
		List<String> words = new ArrayList<String>();
		words.add("One");
		words.add("Two");
		words.add("Three");
		words.add("Four");
		words.add("Five");
		
		List<String> everyOther = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				everyOther.add(words.get(i)); 
			}
		}
		System.out.println("The old list is " + words.toString());
		System.out.println("The new list is " + everyOther.toString());
		
		Collections.sort(listOfIntegers);
		System.out.println(listOfIntegers);
		
		List<Character> newChar = new ArrayList<Character>();
		newChar.add('a');
		newChar.add('b');
		newChar.add('c');
		newChar.add('d');
		newChar.add('e');
		char letter = newChar.remove(3);
		System.out.println(letter);
		
		int indexVal = 1;
		List<String> productList = new ArrayList<>(); 
		
		productList.add("Macbook");
		productList.add("HP Notebook");
		productList.add("iPhone 12");
		productList.add("Acer Aspire");
		productList.add("Windows Surface");
		productList.add("Galaxy S20");
		//DO NOT CHANGE CODE ABOVE
		
		// Write your code below this line
		
		if (indexVal >= 0 && indexVal < productList.size()) {
			System.out.println(productList.get(indexVal));
		} else {
			System.out.println("No product can be found with that product number.");
		}
		
		
		int num1 = 5;
		int num2 = 5;
		int num3 = 5;
		int num4 = 5;
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(num1);
		intList.add(num2);
		intList.add(num3);
		intList.add(num4);
		intList.add(num1 + num2 + num3 + num4);
		System.out.println(intList);
		
		int userNumber = 50;
		List<Integer> factors = new ArrayList<Integer>();
		for (int i = 1; i <= userNumber; i++) {
			if (userNumber % i == 0) {
				factors.add(i);
			}
		}
		System.out.println(factors);
		
	}
	
	public static Map<Character, Integer> countStartingLetters(List<String> list) {
		Map<Character, Integer> results = new HashMap<Character, Integer>();
		for (String string : list) {
			char c = string.charAt(0);
			if (results.get(c) == null) {
				results.put(c,  1);
			} else {
				results.put(c, results.get(c) + 1);
			}
		}
		return results;
	}
	
	public static String getDefination(Map<String, String> map, String string) {
		for (String key : map.keySet()) {
			if (key.equals(string)) {
				return map.get(key);
			} 
		}
		return "";
	}
	
	public static Set<Integer> extractEvens(Set<Integer> set) {
		Set<Integer> results = new HashSet<Integer>();
		for (Integer number : set) {
			if (number % 2 == 0) {
				results.add(number);
			}
		}
		return results;
	}
	
	public static List<String> convertSetToList(Set<String> set) {
		List<String> results = new ArrayList<String>();
		for (String string : set) {
			results.add(string);
		}
		return results;
	}
	
	public static Set<String> findAllThatStartWith(Set<String> set, char c) {
		Set<String> results = new HashSet<String>();
		for (String string : set) {
			if (string.charAt(0) == c) {
				results.add(string);
			}
		}
		
		return results;
	}
	
	public static List<Integer> caculateStringLengths(List<String> list) {
		List<Integer> lengths = new ArrayList<Integer>();
		for (String string : list) {
			lengths.add(string.length());
		}
		return lengths;
	}
	
	public static List<List<Integer>> sortDivisibleNumbers(List<Integer> list) {
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		
		for (Integer number : list) {
			if ( number % 2 == 0) {
				results.get(0).add(number);
			} 
			if (number % 3 == 0) {
				results.get(1).add(number);
			}
			if (number % 5 == 0) {
				results.get(2).add(number);
			}
			if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
				results.get(3).add(number);
			}
		}
		return results;
	}
	
	public static String combineStrings(List<String> strings) {
		StringBuilder result = new StringBuilder();
		for (String string : strings) {
			result.append(string + ", ");
		}
		return result.toString();
	}
	
	public static List<String> search(List<String> list, String query) {
		List<String> results = new ArrayList<String>();
		for (String string : list) {
			if (string.contains(query)) {
				results.add(string);
			}
			
		}
		return results;
	}
	
	public static List<String> swapFirstAndLast(List<String> list) {
		String temp = list.get(0);
		list.set(0, list.get(list.size() - 1));
		list.set(list.size() - 1, temp);
		return list;
	}
	
	public static String findShortestString(List<String> list) {
		String shortest = list.get(0);
		for (String string : list) {
			if (string.length() < shortest.length()) {
				shortest = string;
			}
		}
		return shortest;
	}

}
