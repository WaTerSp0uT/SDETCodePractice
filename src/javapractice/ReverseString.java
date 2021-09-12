package javapractice;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseStringBuffer("Yaroslav"));
        System.out.println(reverseString("Yaroslav"));
    }


    public static String reverseStringBuffer(String inputStr){

        StringBuffer sb = new StringBuffer(inputStr);
        sb.reverse();
        return sb.toString();
    }

    public static String reverseString(String inputString){
        String reversedString ="";

        for(int i=inputString.length()-1; i>=0; i--){

            reversedString = reversedString +  inputString.charAt(i);

        }
        return reversedString;
    }

}
