package javapractice;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseInt(1234));
    }

    public static int reverseInt(int number){
        int reversed = 0;
        // %10 -> will give you last
        // /10 -> will give you reminder 123
        while (number>0) {
            reversed = reversed * 10 + number % 10;
            number = number / 10;
        }
        return reversed;
    }
}
