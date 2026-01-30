public class Trial {

    /*
     * 
     * * * * *
     * * *
     * *
     * 
     * 
     */
    public static void main(String[] args) {
        // int rows = 4;
        // int controller = 0;
        // for (int i = 0; i < rows; i++) {
        // System.out.print("*\t");
        // if (i == rows - 1 && controller <= rows) {
        // controller++;
        // i = -1;
        // rows--;
        // System.out.println();
        // }
        // }
        System.out.println("show");

        // A obj = new A() {
        // public void show() {
        // System.out.println("xyz");
        // }
        // };
        // obj.show();

        A obj = () -> {
            System.out.println("hello");
        };
    }
}

interface A {

    void show();
}
