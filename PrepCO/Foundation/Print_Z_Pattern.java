package PrepCO.Foundation;

public class Print_Z_Pattern {
    public static void main(String[] args) {
        int temp = 4;
        for (int i = 0; i < 5; i++) {
            for (int sp = 0; sp < temp; sp++) {
                if (i != 0 && i != 5) {
                    System.out.print("\t");
                }
            }
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4) {
                    System.out.print("*\t");
                } else {
                    System.out.print("*");
                    break;
                }
            }
            temp--;
            System.out.println();
        }
    }
}
