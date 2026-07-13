package InputFormating;

import java.io.*;
import java.util.*;

public class BRinput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        // String[] arr = br.readLine().trim().split("\\s+");
        br.close();
    }
}
