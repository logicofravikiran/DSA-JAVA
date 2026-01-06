package PrepCO.Foundation;

public class RotateNumber {
    public static void main(String[] args) {
        int num = 27391; // -2 39127 73912 39127
        int temp = num;
        int rotations = 3;
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        if (rotations > 0) {
            rotations = rotations % count;
        } else {
            rotations = rotations % -count;
            rotations = count + rotations;
            // rotations = Math.abs(Math.abs(rotations) - count);

        }
        num = temp;

        for (int i = 0; i < (rotations % count); i++) {
            int rem = num % 10;
            num /= 10;
            num = num + rem * (int) Math.pow(10, count - 1);
        }

        System.out.println(num);
    }
}
