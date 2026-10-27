package threads;

public class Thread1Example implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running via Runnable interface");
    }

    static void main() {
        Thread1Example obj=new Thread1Example();
        Thread thread=new Thread(obj);
        thread.start();
    }
}
