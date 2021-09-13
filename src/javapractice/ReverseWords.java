package javapractice;

public class ReverseWords {

    public static void main(String[] args) {

        reverseWords(" Hello My Name is Yaro ");

        reverseEachWord1(" Hello My Name is Yaro ");

        reverseEachWord2(" Hello My Name is Yaro ");
    }


    public static void reverseWords(String inputString) {
        String reversed = "";
        String[] arrOfWords = inputString.trim().split("\\s+");

        for (int i = arrOfWords.length - 1; i >= 0; i--) {

            reversed += arrOfWords[i] + " ";
        }
        System.out.println(reversed);
    }

    //Reverese each word and sentece
    public static void reverseEachWord1(String inputString) {
        String reversedSentence = "";
        String[] arrOfWords = inputString.trim().split("\\s+");

        for (int i = arrOfWords.length - 1; i >= 0; i--) {
            //setting to empty before going inside;
            String reversedWord = "";

            for (int j = arrOfWords[i].length() - 1; j >= 0; j--) {

                reversedWord += arrOfWords[i].charAt(j);
            }
            reversedSentence += reversedWord + " ";
        }
        System.out.println(reversedSentence);
    }
    //ReverseEach Word
    public static void reverseEachWord2(String inputString) {

        String reversedSentence = "";
        String[] arrOfWords = inputString.trim().split("\\s+");

        for(String word : arrOfWords){

            String reversedWord ="";
            int wordIndex = word.length()-1;

            while(wordIndex >= 0){

                reversedWord += word.charAt(wordIndex);
                wordIndex--;
            }
            reversedSentence += reversedWord + " ";
        }

        System.out.println(reversedSentence);
    }
}
