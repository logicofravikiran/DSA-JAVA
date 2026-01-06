package PrepCO.Foundation;

class GCD_LCM {

    public static void main(String[] args) {
        int a = 18;
        int b = 18;

        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int gcd = 0;

        if (max % min == 0) {
            gcd = min;
        }
        int divisor = min;
        while (a > 0) {
            if (max % divisor == 0 && min % divisor == 0) {
                gcd = divisor;
                System.out.println("in if");
                break;
            }
            divisor = max % divisor;
            System.out.println(divisor);
            max = min;
        }

        // for (int i = min - 1; i > 2; i--) {
        // if (min % i == 0 && max % i == 0) {
        // gcd = i;
        // break;
        // }
        // }
        System.out.println(gcd);
    }
}