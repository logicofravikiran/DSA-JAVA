package NewStrinFolder;

import java.util.*;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUniqueCharacterInString(s));
        System.out.println(OptimizedFirstUniqueCharacterInString(s));
    }

    // @Deprecated
    private static int firstUniqueCharacterInString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    // optimized
    private static int OptimizedFirstUniqueCharacterInString(String s) {
        List<Character> list = new ArrayList<>();

        s.chars()
                .mapToObj(c -> (char) c)
                .forEach(list::add);

        int i = 0;
        Character ch = '-';
        while (!list.isEmpty() && i < s.length()) {
            ch = s.charAt(i);
            list.remove((Character) s.charAt(i));
            System.out.println(list);
            if (!list.contains(ch)) {
                return i;
            } else {
                list.add(i, ch);
            }
            i++;
        }
        return -1;
    }

}
