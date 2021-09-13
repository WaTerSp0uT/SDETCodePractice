package javapractice;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] numArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        findMissing(numArr);

    }

    public static void findMissing(int[] numArr) {

        int expectedSum = 0;
        int actualSum = 0;
        //Summing up numbers in actual array
        for (int i = 0; i < numArr.length; i++) {
            actualSum += numArr[i];
        }
        //Summing up if it was a right count
        for (int i = 1; i <= numArr.length + 1; i++) {
            expectedSum += i;
        }
        System.out.println("Missing number is " + (expectedSum - actualSum));
    }
}
