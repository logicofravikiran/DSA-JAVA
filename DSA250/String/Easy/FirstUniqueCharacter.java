package DSA250.String.Easy;

public class FirstUniqueCharacter {
    private static int firstUniqChar(String s) {
        // int index = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            System.out.println(s.substring(i + 1) + " && " + s.charAt(i));
            System.out.println("first" + s.substring(0, i).indexOf(s.charAt(i)));
            System.out.println("last" + s.substring(i + 1).indexOf(s.charAt(i)));
            if ((s.substring(i + 1).indexOf(s.charAt(i)) == -1) && (s.substring(0, i).indexOf(s.charAt(i)) == -1)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "aabb";
        // int n = s.substring(1).indexOf(s.charAt(0));
        // System.out.println(n);
        System.out.println(firstUniqChar(s));
    }
}
