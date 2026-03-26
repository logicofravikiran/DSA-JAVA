package InputFormating;

import java.io.*;
import java.util.*;

public class StringFormatArray {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        br.close();
        str.trim();
        String[] parts = str.split(" ");

        int[] arr = new int[parts.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
