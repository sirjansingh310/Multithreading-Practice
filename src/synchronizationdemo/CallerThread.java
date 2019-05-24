package synchronizationdemo;

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
    public void run(){
        this.target.call(this.message);
    }
}
