package InputFormating;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BracketInput {
    public static void main(String[] args) throws IOException {
        takeBracketInput();
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // String line = br.readLine();

        // line.trim();
        // line = line.replaceAll("\\[|\\]", "");

        // String[] parts = line.split(",");

        // int[] arr = new int[parts.length];
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = Integer.parseInt(parts[i]);
        // }

        // System.out.println(Arrays.toString(arr));
    }

    private static void takeBracketInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String:- ");
        String str = br.readLine().trim();
        str = str.replaceAll("\\[|\\]", "");
        String[] parts = str.split(",");

        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
