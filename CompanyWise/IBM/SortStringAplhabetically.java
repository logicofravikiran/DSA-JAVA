package CompanyWise.IBM;

import java.util.Arrays;

/*Sort String Alphabetically**

Simple alphabet sort:

```
Input: "bca"
Output: "abc" */

public class SortStringAplhabetically {
    public static void main(String[] args) {
        String str = "acb";
        System.out.println(sortedString(str));
    }

    private static String sortedString(String str) {
        char[] chars = str.toCharArray();
        char temp = 'o';
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (chars[i] > chars[j]) {
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(chars));

        str = Arrays.toString(chars);
        return str;
    }
}
