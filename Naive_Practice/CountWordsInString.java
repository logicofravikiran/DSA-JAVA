package Naive_Practice;

public class CountWordsInString {
    public static void main(String[] args) {
        String str = "     I will buy a my first vehicle of worth 50 lakhs            ";
        // ! Logic 1
        str = str.trim();
        System.out.println(str + "!");
        int count = 0;
        boolean isWordContinue = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && isWordContinue) {
                count++;
                isWordContinue = false;
            } else if (str.charAt(i) == ' ') {
                isWordContinue = true;
            }
        }
        System.out.println(count);

        // ! Logic 2

        String[] words = str.split("\\s+");
        System.out.println(words.length);
    }
}
