// 
package NumberSystem;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int num = 371;
        System.out.println("Is Armstrong? :- " + isArmStrong(num));
    }

    static boolean isArmStrong(int num) {
        int count = 0;
        int temp = num;
        while (num > 0) {
            num /= 10;
            count++;
        }

        num = temp;
        int newNum = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            newNum += Math.pow(rem, count);
        }

        if (newNum == temp) {
            return true;
        }
        System.out.println(count);
        return false;
    }
}