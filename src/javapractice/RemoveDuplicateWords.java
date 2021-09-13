package javapractice;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

    public static void main(String[] args) {
        String str = "Hello Hello my name is Yaroslav";

        System.out.println(removeDuplicateWords(str));
    }

    private static String removeDuplicateWords(String inputString){
        String [] stringArr = inputString.trim().split("\\s+");
        Set<String> uniqueWords = new LinkedHashSet<>();
        String returnString ="";

        for (String eachStr: stringArr){
            uniqueWords.add(eachStr);
        }
        //Iterating over hashSet and saving into the new string
        Iterator itr = uniqueWords.iterator();
        while(itr.hasNext()){
            returnString+=itr.next() + " ";
        }

        return returnString;
    }
}
