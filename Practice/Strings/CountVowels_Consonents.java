public class CountVowels_Consonents {
    public static void main(String[] args) {
        String str = "A";
        int vowelCount = 0;
        int cCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' ||
                    str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u' ||
                    str.charAt(i) == 'A' ||
                    str.charAt(i) == 'E' ||
                    str.charAt(i) == 'I' ||
                    str.charAt(i) == 'O' ||
                    str.charAt(i) == 'U') {
                vowelCount++;
            } else if (((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 90) ||
                    (int) str.charAt(i) >= 97 && (int) str.charAt(i) <= 122) {
                cCount++;
            }
        }
        System.out.println("Vowels:- " + vowelCount);
        System.out.println("Consonents:- " + cCount);

    }
}
