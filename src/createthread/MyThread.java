package createthread;

public class MyThread implements Runnable{
    private Thread thread;
    MyThread(){
        thread = new Thread(this, "My Thread");
        System.out.println("Thread created " + thread);
        thread.start();
    }
    public void run(){
        try{
            for(int i = 0; i < 10; i++){
                System.out.println("Child thread " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e){
            System.out.println("My Thread interrupted");
        }
    }

}
