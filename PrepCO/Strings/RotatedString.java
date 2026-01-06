package PrepCO.Strings;

public class RotatedString {
    public static void main(String[] args) {

        String str = "forgeeksgeeks";
        String str2 = "geeksforgeeks";

        String s1 = "abcd";
        String s2 = "cdab";

        System.out.println("Is true:- " + RotatedString.comparingString(str, str2));
    }

    static boolean comparingString(String str, String str2) {

        if (str.length() != str2.length()) {
            return false;
        }

        int index = str2.indexOf(str.charAt(0));
        System.out.println("index:- " + index);
        for (int i = 0; i < str.length(); i++) {
            System.out.println(i);

            if (str2.charAt(index) != str.charAt(i)) {
                return false;
            }
            if (index == str2.length() - 1) {
                index = -1;
            }
            index++;
        }
        return true;
    }
}
