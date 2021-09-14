package javapractice;

public class Factorial {
    public static void main(String[] args) {
        findFactorial(5);
        System.out.println(findFactorialRecursion(3));

    }
    private static void findFactorial(int number) {
        //5! = 5*4*3*2*1=120
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("The Factorial of  number " + number + " is ->" + fact);
    }
    //Multiplies itself once it's called
    private static int findFactorialRecursion(int number){
        if(number <= 1)
            return 1;
        else
            return number * findFactorialRecursion( number -1 );
    }
}
