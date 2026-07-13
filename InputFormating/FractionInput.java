package InputFormating;

public class FractionInput {
    public static void main(String[] args) {
        String str = "1/2 3/4";

        // str = str.replaceAll("\\/|\\ ", " ");

        String[] nums = str.split(" ");

        String[] fraction1 = nums[0].split("/");
        String[] fraction2 = nums[1].split("/");

        int a = Integer.parseInt(fraction1[0]);
        int b = Integer.parseInt(fraction1[1]);
        int c = Integer.parseInt(fraction2[0]);
        int d = Integer.parseInt(fraction2[1]);

        System.out.println(a + " " + b + " " + c + " " + d);
        double f1 = (double) a / b;
        double f2 = (double) c / d;
        System.out.println(f1);
        Double sum = f1 + f2;
        System.out.println(sum);
    }
}
