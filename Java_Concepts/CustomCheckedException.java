package Java_Concepts;

public class CustomCheckedException extends Exception {
    CustomCheckedException(String msg) {
        super(msg);
    }
}

class Test {
    static void checkAge(int age) throws CustomCheckedException {
        if (age < 18) {
            throw new CustomCheckedException("Age must be 18+");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (CustomCheckedException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
