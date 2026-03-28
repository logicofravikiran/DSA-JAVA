package InputFormating;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StringOfSpaceSeparatedWords {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.trim();
        // str = str.stripTrailing();

        String[] parts = str.split(" ");

        System.out.println(Arrays.toString(parts));
        br.close();
    }
}
