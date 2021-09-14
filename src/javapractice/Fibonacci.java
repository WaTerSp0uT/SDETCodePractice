package javapractice;

public class Fibonacci {
    public static void main(String[] args) {
        printFibonacci(10);
    }

    private static void printFibonacci(int times) {
        int first = 0;
        int second = 1;

        for (int i = 1; i <= times; i++) {
            //printing fibonacci
            System.out.print(first+" ");
            int third = first + second;
            first = second;
            second = third;
        }
    }
}
