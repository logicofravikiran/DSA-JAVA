package InputFormating;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class OutputWithDecimalPoints {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();
        double n1 = Double.parseDouble(br.readLine());

        System.out.println(String.format("%.3f", num));

        sc.close();
        br.close();
    }
}
