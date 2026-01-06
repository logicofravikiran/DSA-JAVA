package Other;

public class FirstOccurrence {
    public static void main(String[] args) {
        FirstOccurrence focc = new FirstOccurrence();
        System.out.println(focc.indexOfFirstOcc("sadbutsad", "but"));
    }

    public int indexOfFirstOcc(String haystack, String needle) {
        int index = -1;
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, (i + needle.length())).equals(needle)) {

                    index = i;
                }
            }
        }
        return index;
    }
}
