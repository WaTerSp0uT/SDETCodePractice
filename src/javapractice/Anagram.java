package javapractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String str1 = "mary";
        String str2 = "army";
        String str3 = "maryda";
        String str4 = "army";
        checkAnagram(str1,str2);
        checkAnagram(str3,str4);

        ArrayList arr = new ArrayList<String>(Arrays.asList("asd","wowow","asda"));
    }



    public static void checkAnagram(String str1, String str2){

        //char[] array1 = str1.toLowerCase().toCharArray();
        //char[] array2 = str2.toLowerCase().toCharArray();

        String[] array1 = str1.toLowerCase().split("");
        String[] array2 = str2.toLowerCase().split("");

        Arrays.sort(array1);
        Arrays.sort(array2);


        if(!(str1+str2).matches("[a-zA-Z]+")){
            System.out.println("This is not an ANAGRAM with only letters");
        }else if(Arrays.equals(array1,array2)){
            System.out.println("this is an ANAGRAM");
        }else{
            System.out.println("This is not an ANAGRAM");
        }
    }
}
