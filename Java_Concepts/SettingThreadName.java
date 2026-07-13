package Java_Concepts;

public class SettingThreadName {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread obj = new MyThread("My Thread");
        obj.start();

    }
}

class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("New Thread");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Ghe maza");
        System.out.println(Thread.currentThread().getName());
    }
}