package javapractice;

public class Palindrome {

    public static void main(String[] args) {
        String word = "AArSraA";
        System.out.println(isPalindrome1(word));
        System.out.println(isPalindrome2(word));
        System.out.println(isPalindrome3(word));
    }

    public static boolean isPalindrome1(String inputString) {
        if (inputString.length() <= 1)
            return true;
        String modifyString = "";
        if (inputString != null && inputString.length() > 1) {
            modifyString = inputString.toLowerCase();
            StringBuffer sb = new StringBuffer(modifyString);

            if (modifyString.equals(sb.reverse().toString()))
                return true;

            return false;
        }
        return false;
    }

    public static boolean isPalindrome2(String inputString) {
        if (inputString.length() <= 1)
            return true;
        String modifyString = "";
        if (inputString != null && inputString.length() > 1) {
            modifyString = inputString.toLowerCase();

            if (modifyString.equals(reversedString(inputString).toLowerCase()))
                return true;

            return false;
        }
        return false;
    }

    public static String reversedString(String inputString) {
        String reversedString = "";
        if (inputString != null && inputString.length() > 1) {
            for (int i = inputString.length() - 1; i >= 0; i--) {
                reversedString += inputString.charAt(i);
            }
            return reversedString;
        }
        return null;
    }

    //USING Recursion
    public static boolean isPalindrome3(String inputString) {

        if (inputString == null)
            return false;
        String modifyString = inputString.toLowerCase();
        //Once it's reached to middle or 0
        if (inputString.length() <= 1)
            return true;

        String firstLetter = modifyString.substring(0, 1);
        String lastLetter = modifyString.substring((inputString.length() - 1));
        //compares first VS last
        if (!firstLetter.equals(lastLetter)) {
            return false;
        } else {
            //ReRuns with new  Shorter string
            return isPalindrome3(inputString.substring(1, inputString.length() - 1));
        }
    }

}
