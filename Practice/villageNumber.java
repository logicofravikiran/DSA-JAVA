
public class villageNumber {
    public static void main(String[] args) {
        int num = 38;
        int rem = 0;
        int newNum = 0;
        while (num > 0) {
            rem = num % 10;
            num /= 10;
            newNum += rem;
            System.out.println("Rem:- " + rem + " && num:- " + num + " && newNum:-" + newNum);
            // newRemainder = newNum / 10;

            if (num == 0) {
                if (newNum > 10) {
                    num = newNum;
                    newNum = 0;

                } else if (newNum < 10 && newNum >= 0) {
                    break;
                }
            }
        }
        System.out.println(newNum);
    }
}
