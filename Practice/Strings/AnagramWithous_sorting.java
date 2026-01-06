public class AnagramWithous_sorting {
    public static void main(String[] args) {
        String str1 = "shashi";
        String str2 = "ashish";
        anagramStringsWithout_sorting(str1, str2);
    }

    static boolean anagramStringsWithout_sorting(String str1, String str2) {
        str1 = new String(str1);
        str2 = new String(str2);
        str1.toLowerCase();
        str2.toLowerCase();
        if (str1.length() != str2.length()) {
            return false;
        }
        boolean isAnagram = false;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    str2.replace(str2.charAt(j), '_');
                    // str2.replace(str2.charAt(j), "_");
                }
                System.out.println(str2);
            }
        }
        return isAnagram ? true : false;
    }
}
