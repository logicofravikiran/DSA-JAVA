package InputFormating;

import java.io.*;

public class DoubleOutputUpto3Decimals {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Double num = Double.parseDouble(br.readLine().trim());
        System.out.printf("%.3f", num);
        System.out.println();
        // * OR
        System.out.println(String.format("%.3f", num));
        br.close();
    }
}
