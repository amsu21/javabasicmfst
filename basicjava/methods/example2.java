package basicjava.methods;

public class example2 {
    // CHAR TO STRING
    public static String charToString(char c) {
        return Character.toString(c);
    }

    // STRING TO CHAR
    public static char StringToChar(String str) {
        return str.charAt(0);
    }

    // STRING TO CHAR ARRAY
    public static char[] StringToCharusingtoCharArray(String str) {
        char charArray[] = str.toCharArray();
        for (char ch:charArray) {
            System.out.println(ch);
        }
        return charArray;
    }
}
