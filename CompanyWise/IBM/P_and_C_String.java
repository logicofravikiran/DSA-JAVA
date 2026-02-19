package CompanyWise.IBM;

import java.util.ArrayList;

public class P_and_C_String {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(pc(str));
    }

    private static ArrayList<String> pc(String str) {
        ArrayList<String> list = new ArrayList<>();
        String temp = "";

        int left = 0;
        int right = 0;
        while (right >= left && right < str.length()) {
            if (left == right) {
                continue;
            } else {
                temp = temp + str.charAt(right);
            }
            right++;
            if (right == str.length()) {
                left++;
                right = 0;
                list.add(temp);
            }
        }
        return list;
    }
}
