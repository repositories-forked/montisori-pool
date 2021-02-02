package lk.ijse.dep;

public class HelloThread {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        new Thread(new MyThread()).start();
        new MyThread2().start();
        new Thread(() -> System.out.println("Testing a new thread....!")).start();
    }
}

class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println("This is being executed by My Thread");
        System.out.println(Thread.currentThread().getName());
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println("This is being executed by My Thread2");
        System.out.println(Thread.currentThread().getName());
    }
}
