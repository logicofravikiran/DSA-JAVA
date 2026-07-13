package CompanyWise.TCS;

import java.util.*;

public class RemoveKthPerson {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println(findTheWinner(n, k));
    }

    public static int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int index = 0;

        while (list.size() > 1) {
            index = (index + k - 1) % list.size();
            list.remove(index);
        }

        return list.get(0);
    }
}
