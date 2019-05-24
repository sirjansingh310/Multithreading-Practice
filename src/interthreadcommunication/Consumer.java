package interthreadcommunication;

public class Consumer implements Runnable{
    private Thread thread;
    private Queue queue;
    Consumer(Queue queue){
        this.queue = queue;
        thread = new Thread(this,"Consumer");
        thread.start();
    }
    public void run(){
        while(true){
            queue.get();
        }
    }
}
