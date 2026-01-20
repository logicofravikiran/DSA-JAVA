import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] strs = new String[n];

        // Input strings
        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        // Call function
        List<List<String>> result = groupAnagrams(strs);

        // Output
        System.out.println("Grouped Anagrams:");
        System.out.println(result);

        sc.close();
    }
}
