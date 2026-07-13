package Java_Concepts;

public class MethodDispatch {

    MethodDispatch() {
        System.out.println("Parent");
    }

    int x = 10;

    void run() {
        System.out.println("Run-Parent");
    }
}

class InnerMethodDispatch extends MethodDispatch {
    int x = 5;

    InnerMethodDispatch() {
        // super();
        System.out.println("Child");
    }

    void gun() {
        System.out.println("gun-child");
        System.out.println(x);
        System.out.println(super.x);
    }
}

class Main {
    public static void main(String[] args) {
        InnerMethodDispatch obj = new InnerMethodDispatch();
        obj.run();
        obj.gun();
    }
}