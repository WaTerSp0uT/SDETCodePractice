package javapractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountCharacterOccurrence {

    public static void main(String[] args) {

        String exampleStr = "Yaroslav  y";

        countCharOccurrence(exampleStr);

        countSpecificChar1(exampleStr, "Y");
        countSpecificChar1(exampleStr, "a");

        countSpecificChar2(exampleStr, "o");
        countSpecificChar2(exampleStr, " ");

        countSpecificChar3(exampleStr, "o");
        countSpecificChar3(exampleStr, " ");
    }

    public static void countCharOccurrence(String strExample) {

        Map<String, Integer> mapOfChar = new HashMap<>();

        for (int i = 0; i < strExample.length(); i++) {

            if (!mapOfChar.containsKey(strExample.charAt(i) + "")) {
                mapOfChar.put(strExample.charAt(i) + "", 1);
            } else {
                mapOfChar.put(strExample.charAt(i) + "", mapOfChar.get(strExample.charAt(i) + "") + 1);
            }
        }

        for (String map : mapOfChar.keySet()) {
            System.out.println("The sequence of char->" + map + " and the count will be ->" + mapOfChar.get(map));
        }

    }
    public static void countSpecificChar1(String strExample,String specificChar) {
        int count = strExample.length() - strExample.replaceAll( specificChar,"" ).length();
        System.out.println("Number of char -> " + specificChar + " is->" + count);
    }

    public static void countSpecificChar2(String strExample, String specificChar) {
        int count = 0;
        for (int i = 0; i < strExample.length(); i++) {
            if ((strExample.charAt(i) + "").equals(specificChar)) {
                count += 1;
            }
        }
        System.out.println("Number of char -> " + specificChar + " is->" + count);

    }

    public static void countSpecificChar3(String strExample, String specificChar) {
        List<String> characters = Arrays.asList(strExample.split(""));
        Map<String, Long> map = characters.stream()
                .filter(s -> s.equalsIgnoreCase(specificChar))
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

    }




}


