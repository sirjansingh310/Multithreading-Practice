package createmultiplethreads;

public class ThreadDemo {
    public static void main(String args[]){
        MyThread threads[] = new MyThread[3];
        threads[0] = new MyThread("first");
        threads[0] = new MyThread("second");
        threads[0] = new MyThread("third");
        // waiting for these 3 threads to complete execution

        try{
            Thread.sleep(10000); // To ensure it finishes last. Often, it must be the last thread to finish execution because it performs various shutdown actions
            System.out.println("thread executed " +  Thread.currentThread().getName());
        }
        catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }

    }
}
