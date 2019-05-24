package createthread;

public class ThreadDemo {
    public static void main(String args[]){
        // create a new Thread
        MyThread newMyThread = new MyThread();
        try{
            for(int i = 0; i < 10; i++){
                System.out.println("Main Thread " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println("main thread interrupted");
        }
    }
}
