package interthreadcommunication;

public class Producer implements Runnable {
    private Thread thread;
    private Queue queue;
    Producer(Queue queue){
        this.queue = queue;
        thread = new Thread(this,"Produder");
        thread.start();
    }
    public void run(){
        int i = 0;
        while(true){
            queue.put(i++);
        }
    }
}
