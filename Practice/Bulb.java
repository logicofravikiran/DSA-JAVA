
public class Bulb {
    static int bulbNumber(int power, String str) {
        int bIndex = str.indexOf('B');
        int temp = power;
        int result = 0;
        System.out.println(bIndex);
        for (int i = bIndex + 1; i < str.length(); i++) {
            // right side move
            if (str.charAt(i) == 'H' && power > 0) {
                power--;
                result++;
                System.out.println("Right side if");
                System.out.println("Power:-" + power + " && result:- " + result);
            } else if (str.charAt(i) == 'C' && power > 0) {
                power++;
                System.out.println("Right side else");
                System.out.println("Power:-" + power + " && result:- " + result);

            }
        }
        power = temp;
        for (int i = bIndex - 1; i >= 0; i--) {
            // LEFT side move
            if (str.charAt(i) == 'H' && power > 0) {
                power--;
                result++;
                System.out.println("Left side if");
                System.out.println("Power:-" + power + " && result:- " + result);

            } else if (str.charAt(i) == 'C' && power > 0) {
                power++;
                System.out.println("Power:-" + power + " && result:- " + result);

            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "HHBHHCCCHH";
        int power = 3;
        int result = bulbNumber(power, str);
        System.out.println(result);
    }
}
