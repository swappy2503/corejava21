package threads;

public class Thread2Example extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running via Thread class: "+Thread.currentThread().getName());
    }
    static void main() {
        System.out.println("Main thread: "+Thread.currentThread().getName());
        Thread2Example obj = new Thread2Example();
        obj.start();
    }
}
