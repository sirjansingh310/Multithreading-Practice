package JoinDemo;

public class MyThread implements Runnable {
    private Thread thread;

    MyThread(String threadName) {
        thread = new Thread(this, threadName);
        thread.start();
    }
    public Thread getThread(){
        return thread;
    }
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(thread.getName() + " running " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + "interrupted");
        }
    }
}
