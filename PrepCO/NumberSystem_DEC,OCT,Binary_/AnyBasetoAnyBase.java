public class AnyBasetoAnyBase {
    public static void main(String[] args) {
        int num = 111;
        int ogBase = 2;
        int resultBase = 10;
        int resultNum = anyBasetoAnyBase(num, ogBase, resultBase);
        System.out.println(resultNum);
    }

    public static int anyBasetoAnyBase(int num, int ogBase, int resultBase) {
        int resultNum = 0;
        int power = 0;
        while (num > 0) {
            resultNum += num % resultBase * (int) Math.pow(ogBase, power);
            num /= resultBase;
            power++;
        }
        return resultNum;
    }
}
