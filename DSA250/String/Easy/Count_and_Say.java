package DSA250.String.Easy;

public class Count_and_Say {
    public static void main(String[] args) {
        int n = 4;
        countAndSay(n);
    }

    private static String countAndSay(int n) {
        String result = "1";

        for (int i = 2; i <= n; i++) {
            StringBuilder temp = new StringBuilder();
            int count = 1;

            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == result.charAt(j - 1)) {
                    System.out.println("for if j:- " + j);
                    count++;
                } else {
                    System.out.println("for else j:- " + j);

                    temp.append(count).append(result.charAt(j - 1));
                    count = 1;
                }
            }

            // Append last group
            temp.append(count).append(result.charAt(result.length() - 1));

            System.out.println(temp);

            // System.out.println(temp.append(count));
            // System.out.println(temp.append(result.charAt(result.length() - 1)));

            result = temp.toString();
        }

        return result;
    }

}
