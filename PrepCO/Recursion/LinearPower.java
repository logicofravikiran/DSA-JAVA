package PrepCO.Recursion;

public class LinearPower {
    public static void main(String[] args) {
        int num = 10;
        int power = 3;
        System.out.println(linearPower(num, power));
    }

    private static int linearPower(int num, int power) {
        if (power == 0) {
            return 1;
        }
        return num * linearPower(num, power - 1);
    }
}
