package PrepCO.Foundation;

public class BenjaminBulbs {
    public static void main(String[] args) {
        int num = 5;
        boolean[] arr = new boolean[num];
        int x = 1;
        int itr = 0;
        while (x <= num) {

            for (int i = x; i <= num; i++) {
                if (i % x == 0) {
                    arr[i - 1] = arr[i - 1] ? false : true;
                    System.out.println("x:-" + x + " , i:- " + i);
                }
                itr++;
            }
            x++;
        }
        System.out.println(itr + "itr");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                count++;
            }
        }
        System.out.println(count);
    }
}
