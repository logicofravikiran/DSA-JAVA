package NumberSystem;

import java.util.*;

// TC = O(n)
// SC = O(n)

class Solution {
    public int[] fibSeries(int n) {
        if (n <= 0)
            return new int[0]; // return empty array
        if (n == 1)
            return new int[] { 0 }; // only first element

        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.fibSeries(10)));
    }
}
