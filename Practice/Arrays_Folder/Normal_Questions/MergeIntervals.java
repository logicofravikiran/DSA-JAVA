package Arrays_Folder.Normal_Questions;

import java.util.ArrayList;
import java.util.Arrays;

// 56 merge intervals on LeetCode
public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        System.out.println(Arrays.deepToString(mergedIntervals(arr)));
    }

    public static int[][] mergedIntervals(int[][] intervals) {
        ArrayList<int[]> result = new ArrayList<>();
        boolean isNewStart = false;
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            System.out.println(intervals[i][0] + " ," + intervals[i][1] + " start:- " + start + " end:- " + end);

            if (intervals[i - 1][1] >= intervals[i][0]) {
                end = intervals[i][1];
            } else {
                result.add(new int[] { start, end });
                isNewStart = true;
            }
        }
        System.out.println(Arrays.toString(result.get(0)));
        return result.toArray(new int[result.size()][]);
    }
}
