package javapractice;

public class Pyramid {
    public static void main(String[] args) {
        printPyramid1(10);
        printPyramid2(10);
    }

    public static void printPyramid1(int levels) {
        for (int i = 1; i <= levels; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printPyramid2(int levels) {
        int oneLevelLength = 1;
        for (int i = 1; i <= levels; i++) {
            for (int j = 1; j <= oneLevelLength; j++) {
                System.out.print("*");
            }
            oneLevelLength+=2;
            System.out.println();
        }
    }

}
