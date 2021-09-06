package javapractice;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public static void main(String[] args) {

        countWords("  Hello    myName   is dasd  t  is Hello   dasd  ");
    }

    public static void countWords(String strInput) {
        //splitting to an array
        String[] arrayOfStrings = strInput.trim().split("\\s+");

        //Putting into the map with keys and counting it
        Map<String, Integer> mapOfWords = new HashMap<>();

        for (int i = 0; i < arrayOfStrings.length; i++) {
            //if key does not exist create one
            if (!mapOfWords.containsKey(arrayOfStrings[i])) {
                mapOfWords.put(arrayOfStrings[i], 1);
            } else {
                //if exist add Up the count of word
                mapOfWords.put(arrayOfStrings[i], mapOfWords.get(arrayOfStrings[i]) + 1);
            }
        }
        System.out.println("There are " + arrayOfStrings.length + " of words");
        for (String map : mapOfWords.keySet()) {
            System.out.println("Then count for word:" + map + " is " + mapOfWords.get(map));
        }

    }
}