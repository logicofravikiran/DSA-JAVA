package Situational;

public class Cryptographer {
    public static void main(String[] args) {
        String str = "bcd";
        Cryptographer obj = new Cryptographer();
        String readableStr = obj.decryptedString(str);
        System.out.println(readableStr);
    }

    String decryptedString(String str) {
        StringBuilder readableStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int asciiVal = (int) (str.charAt(i));
            if (asciiVal != 90 || asciiVal != 112) {
                asciiVal -= 1;

            } else {
                asciiVal = 65;
            }
            readableStr.append((char) asciiVal);
        }
        str = readableStr.toString();
        return str;
    }
}
