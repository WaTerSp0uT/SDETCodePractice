package javapractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        String str1= "aassddet11";

        firstNonRepeated(str1);
    }


    public static void firstNonRepeated(String str){

        Map<Character, Integer> mapChars = new LinkedHashMap<>();

        char[] arrOfChars = str.toLowerCase().toCharArray();

        for (int i=0; i < arrOfChars.length; i++){
            if(!mapChars.containsKey(arrOfChars[i]) ){
                mapChars.put(arrOfChars[i], 1);
            }else {
               mapChars.put(arrOfChars[i] , mapChars.get(arrOfChars[i])+1 );
            }
        }
        /*
        for (Character loopedChar : mapChars.keySet() ){
            if(mapChars.get(loopedChar)==1){
                System.out.println("Here is first repeated character ->"+ loopedChar);
                break;
            }
        }
        */
        for (Map.Entry<Character,Integer> entry : mapChars.entrySet() ){
            if(entry.getValue()==1){
                System.out.println("Here is first NON repeated character ->"+ entry.getKey());
                break;
            }
        }

    }
}
