package javapractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        String[] input ={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        String[] output = new String[input.length];

        for(int i=0; i< input.length; i++){
            output[i] = input[i].substring(0,3);
        }

        System.out.println( Arrays.toString(output) );
    }

    ArrayList<String> myArrL= new ArrayList<>(){};
}
