package synchronizationdemomethod2;

public class CallerThread implements Runnable{
    private CallMe target;
    private String message;
    public Thread thread;
    CallerThread(CallMe target, String message){
        this.target = target;
        this.message = message;
        this.thread = new Thread(this);
        thread.start();
    }
    public void run() {
        synchronized (this.target) {
            this.target.call(this.message);
        }
    }
}
