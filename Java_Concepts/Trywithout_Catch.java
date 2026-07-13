package Java_Concepts;

public class Trywithout_Catch {
    public static void main(String[] args) {
        System.out.println("start");
        try {
            System.out.println(10 / 0);
        } finally {
            System.out.println("in finally");
        }
    }
}
