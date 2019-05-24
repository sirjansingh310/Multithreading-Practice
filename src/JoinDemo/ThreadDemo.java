package JoinDemo;

public class ThreadDemo {
    public static void main(String args[]){
        MyThread thread[] = new MyThread[3];
        thread[0] = new MyThread("first");
        thread[1] = new MyThread("second");
        thread[2] = new MyThread("third");
        System.out.println(thread[0].getThread().isAlive()); // getThread is a getter created to return the Thread object.
        // We could directly call isAlive on thread[0] if MyThread class extended Thread instead of implementing Runnable.
        System.out.println(thread[1].getThread().isAlive());
        System.out.println(thread[2].getThread().isAlive());

        try{
            System.out.println("Waiting for child threads to execute ");
            // better than Thread.sleep for static amount of time.
            thread[0].getThread().join(); // throws InterruptedException
            thread[1].getThread().join();
            thread[2].getThread().join();
        }
        catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println(thread[0].getThread().isAlive());
        System.out.println(thread[1].getThread().isAlive());
        System.out.println(thread[2].getThread().isAlive());
        System.out.println("Main thread executed");
    }
}
