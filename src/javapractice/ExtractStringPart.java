package javapractice;

public class ExtractStringPart {

    public static void main(String[] args) {
        String example = "www.ericyarek@gmail.com";

        System.out.println(extractStringLastFour(example));

        System.out.println(extractStringInBetweenChars(example));
    }


    public static String extractStringLastFour(String inputString) {
        String modifiedString = "";

        if (inputString.length() > 3) {
            modifiedString = inputString.substring(inputString.length() - 4);
            return modifiedString;
        } else {
            System.out.println("String is too short");
            return inputString;
        }
    }

    public static String extractStringInBetweenChars(String inputString) {
        String modifiedString = "";

        return modifiedString = inputString.substring(inputString.indexOf(".") + 1, inputString.indexOf(".com"));
    }

}
