package NumberSystem;

public class IntToBinary {
    public static void main(String[] args) {
        // int num = 8;
        // String ns = Integer.toBinaryString(num);
        // System.out.println(ns);x

        int n = 13;
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % 2);
            System.out.println(sb);
            n = n / 2;
            System.out.println(n);
        }

        System.out.println(sb.reverse().toString());
    }
}
