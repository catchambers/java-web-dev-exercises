package org.launchcode.java.countingCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a quote: ");
        String text = input.nextLine().toLowerCase();

        HashMap<Character, Integer> characterCounts = new HashMap<>();
        char[] charactersInString = text.toCharArray();

        //loop through string one character at a time
        for (char character : charactersInString) {

            //check if alphabetic character
            if (Character.isAlphabetic(character)) {
                //hashmap contains character, update the count
                if (characterCounts.containsKey(character)) {
                    characterCounts.put(character, characterCounts.get(character) + 1);
                } else { //if character not a key add key
                    characterCounts.put(character, 1);
                }
            }
        }
        //loop through data structure to print results, on key value pair per line
        for (Map.Entry<Character, Integer> keyValuePair : characterCounts.entrySet()) {
            System.out.println(keyValuePair.getKey() + " : " + keyValuePair.getValue());
        }
    }
}
