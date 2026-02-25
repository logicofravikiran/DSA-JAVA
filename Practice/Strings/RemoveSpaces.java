
public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "abc def ghijkl mnopqr st u ";
        // str.trim();
        // String ans = "";
        // int start = 0;
        // int end = 1;
        // boolean isConcat = false;
        // for (int i = 0; i < str.length(); i++) {
        // System.out.println("-----------" + i + "th iteration-----------------");
        // if (str.charAt(i) == ' ') {
        // isConcat = true;
        // if (i != 0) {
        // end = i + 2;
        // }
        // if (i <= (str.length() - 1)) {
        // start = i + 1;
        // }
        // } else {
        // if (isConcat) {
        // ans = ans.concat(str.substring(start, end));
        // start++;
        // end++;
        // } else {
        // ans = str.substring(start, end);
        // isConcat = false;
        // // isConcat = false;
        // }
        // // ans = (str.substring(start, end));
        // end++;
        // System.out.println(ans);
        // }
        // System.out.println("Start:- " + start);
        // System.out.println("End:- " + end);
        // System.out.println(ans);
        // }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                stringBuilder.append(str.charAt(i));
            }
            System.out.println(stringBuilder);
        }
    }
}