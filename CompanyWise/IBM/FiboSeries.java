package CompanyWise.IBM;

import java.util.LinkedList;

public class FiboSeries {
    public static void main(String[] args) {
        int input = 10;
        System.out.println(fiboSeries(input));
    }

    private static LinkedList<Integer> fiboSeries(int input) {
        LinkedList<Integer> list = new LinkedList<>();

        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < input; i++) {
            list.add(a);
            c = a + b;
            a = b;
            b = c;
        }
        return list;
    }
}
