package javapractice;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateChar {
    public static void main(String[] args) {

        findDuplicateChar1("Heeelllllo");
    }

    public static void findDuplicateChar1(String exampleString) {

        Map<Character, Integer> mapOfChar = new HashMap<>();

        for (int i = 0; i < exampleString.length(); i++) {
            if (!mapOfChar.containsKey(exampleString.charAt(i))) {
                mapOfChar.put(exampleString.charAt(i), 1);
            } else {
                mapOfChar.put(exampleString.charAt(i), mapOfChar.get(exampleString.charAt(i)) + 1);
            }
        }

        for (Character duplicateChar : mapOfChar.keySet()) {
            if (mapOfChar.get(duplicateChar) > 1)
                System.out.println("There was a duplicate character: " + duplicateChar + " with occurrence->" + mapOfChar.get(duplicateChar));
        }

    }


    //this one not finished logic
    public static void findDuplicateChar2(String exampleString) {
        int countOfChars = exampleString.length();
        int occurrence;
        for (int i = 0; i < exampleString.length(); i++) {
            int countOfCharSubtracted = exampleString.replaceAll(exampleString.charAt(i) + "", "").length();
            occurrence = countOfChars - countOfCharSubtracted;

            if (occurrence > 1) {
                System.out.println("This char duplicated: " + exampleString.charAt(i) + " occurrence->" + occurrence);
            }
        }

    }
}
