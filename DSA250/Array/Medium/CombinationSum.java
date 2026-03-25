package DSA250.Array.Medium;

import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = { 2, 3, 6, 7 };
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();

        int left = candidates.length - 1;
        int right = candidates.length - 1;
        // int count = 0;
        int goal = target;
        while (left >= 0) {
            goal = target;
            System.out.println("candidates[left] :- " + candidates[left]);
            List<Integer> tempList = new ArrayList<>();

            if (candidates[left] == goal) {
                tempList.add(candidates[left]);
                goal -= candidates[left];
                System.out.println("Perfect shot");
            }

            right = left;

            while (goal > 0 && left >= 0) {

                System.out.println("inside while");

                System.out.println("Goal:- " + goal + ", left:- " + left + ", candidates[left]:- " + candidates[left]);

                if (candidates[left] == goal) {
                    System.out.println("in if");
                    tempList.add(candidates[left]);
                    break;
                } else if (candidates[left] < goal) {
                    System.out.println("in first");
                    tempList.add(candidates[left]);
                    goal -= candidates[left];
                } else if (candidates[left] > goal) {
                    System.out.println("in last");
                    left--;
                }

                System.out.println("temp List:- " + tempList);

            }

            left = right;

            if (!tempList.isEmpty() && goal == 0) {

                System.out.println("list updated");
                list.add(tempList);
                System.out.println(list);
            } else {
                System.out.println("NOT SUCCESSFUL");
            }

            left--;

            System.out.println("-------------------");

        }
        return list;

    }
}
