package javapractice;

public class CountWords {
    public static void main(String[] args) {


        countWords("  Hello    myName   is dasd  t      ");
    }

    public static void countWords (String strInput){
        String[] arrayOfStrings = strInput.trim().split("\\s+");

        System.out.println("Thre are "+ arrayOfStrings.length+ " - counted words:");

        for(String word : arrayOfStrings){
            System.out.println(word);
            //asd
        }
    }
}