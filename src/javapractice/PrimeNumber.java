package javapractice;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        //Prime number has to follow two factors:
        //needs to be divided by 1 and itself;
        System.out.println("Please input the limit: ");
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();

        for (int numberToCheck = 2; numberToCheck <= limit; numberToCheck++) {
            //numberToCheck / 2 -> because if we went thrue half of the numbers we don't
            //need to move forward
            boolean isPrime = true;
            for (int factor = 2; factor <= numberToCheck/2; factor++) {
                if (numberToCheck % factor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primeNumbers.add(numberToCheck);
            }
        }

        for(Integer prime : primeNumbers){
            System.out.println(prime);
        }
    }


}
