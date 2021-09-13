package javapractice;

import java.util.Arrays;

public class LargestSmallestElementInArray {
    public static void main(String[] args) {
        int[] arrNumbers = {12, 4, 123, -4, 12,-4};

        findLargestAndSmallest(arrNumbers);
        findLargestAndSmallest1(arrNumbers);
    }

    public static void findLargestAndSmallest(int[] arrNumbers) {
        int smallest = arrNumbers[0];
        int largest = arrNumbers[0];

        for (int i = 1; i <= arrNumbers.length - 1; i++) {

            if (smallest < arrNumbers[i]) {
                smallest = arrNumbers[i];
            } else if (largest > arrNumbers[i]) {
                largest = arrNumbers[i];
            }
        }
        System.out.println("Largest => " + largest);
        System.out.println("Smallest => " + smallest);
    }

    public static void findLargestAndSmallest1(int[] arrNumbers) {
        Arrays.sort(arrNumbers);
        System.out.println("Largest => " + arrNumbers[0]);
        System.out.println("Smallest => " + arrNumbers[arrNumbers.length-1]);
    }

}
