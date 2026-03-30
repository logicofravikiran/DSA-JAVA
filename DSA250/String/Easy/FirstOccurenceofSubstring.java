package DSA250.String.Easy;

public class FirstOccurenceofSubstring {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStrDemo(haystack, needle));
        // System.out.println(haystack.substring(0, 0 + 3));
    }

    private static int strStrDemo(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (needle.equals(haystack.substring(i, i + needle.length()))) {
                return i;
            }
        }
        return -1;
    }
}
