package createmultiplethreads;

public class MyThread extends Thread{
    MyThread(String threadName){
        super(threadName);
        start();
    }
    public void run(){
        try{
            for(int i = 0; i < 10; i++){
                System.out.println(this.getName() + " " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e){
            System.out.println(this.getName() +" interrupted");
        }
    }
}
