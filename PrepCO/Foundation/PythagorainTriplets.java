package PrepCO.Foundation;

public class PythagorainTriplets {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 4;
        int max = Math.max(a, Math.max(c, b));
        if (max == a) {
            if (max * max == (b * b) + (c * c)) {
                System.out.println("It is a Pythagorian Triplet    --1st ");
            } else {
                System.out.println("It is not a Pythagorian Triplet");

            }
        } else if (max == b) {
            if (max * max == (a * a) + (c * c)) {
                System.out.println("It is a Pythagorian Triplet -----2nd");
            } else {
                System.out.println("It is not a Pythagorian Triplet");

            }
        } else if (max == c) {
            if (max * max == (a * a) + (b * b)) {
                System.out.println("It is a Pythagorian Triplet----------3rd");
            } else {
                System.out.println("It is not a Pythagorian Triplet");

            }
        }

    }
}
