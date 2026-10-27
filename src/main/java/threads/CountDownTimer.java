package threads;

public class CountDownTimer {
    static void main() {
        Thread thread = new Thread(() -> {
            for (int i = 5; i > 0; i--) {
                System.out.println("Background Timer: "+i+" seconds remaining");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("finished.");
        });
        thread.start();
        System.out.println("In Main thread: "+Thread.currentThread().getName());
    }
}