
// import java.util.HashSet;
import java.util.LinkedList;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "abcabcbb";
        LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println("Final count:-  " + obj.lengthOfLongestSubstring(str));
    }

    public int lengthOfLongestSubstring(String s) {

        int maxCount = 0;
        for (int i = 0; i < s.length(); i++) {
            LinkedList<Character> ll = new LinkedList<Character>();
            ll.add(s.charAt(i));
            System.out.println(s.charAt(i));
            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j)) {
                    if (ll.contains(s.charAt(j))) {
                        break;
                    } else {
                        count++;
                        ll.add(s.charAt(j));
                    }
                    System.out.println(s.charAt(j) + " if");
                } else {
                    System.out.println(s.charAt(j) + "  else");
                    break;
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
            System.out.println("count:- " + count);
            System.out.println("Maxcount:- " + maxCount);
            System.out.println("---------------");
        }
        return maxCount;
    }
}
