package Situational;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        int children = 3;
        System.out.println(totalChocolate(children));
    }

    static int totalChocolate(int children) {
        int totalNum = 0;
        for (int i = 1; i <= children; i++) {
            if (children % 5 == 0) {
                if ((i - 1) % 5 == 0 || (i + 1) % 5 == 0) {
                    totalNum += i + 2;
                } else {
                    totalNum += i;
                }
            } else {
                if (((i - 1) % 5 == 0 || (i + 1) % 5 == 0) && i != 1) {
                    totalNum += i + 2;
                } else {
                    totalNum += i;
                }
            }

        }
        return totalNum;
    }
}
