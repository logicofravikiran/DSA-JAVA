package Naive_Practice;

public class RemoveAllSpacesInString {
    public static void main(String[] args) {
        String str = "     I will buy a my first vehicle of worth 50 lakhs            ";

        // ! Logic 1
        str = str.trim();
        String[] words = str.split("\\s+");
        String res = "";
        for (int i = 0; i < words.length; i++) {
            res += words[i];
        }
        res = res + "!";
        System.out.println(res);

        // ! Logic 2

        str = str.replaceAll("\\s+", "");
        System.out.println(str);
    }
}
