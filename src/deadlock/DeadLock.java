package deadlock;

public class DeadLock implements Runnable{
    A a = new A();
    B b = new B();
    DeadLock(){
        Thread.currentThread().setName("Main thread");
        Thread t = new Thread(this, " Racing thread");
        t.start();
        a.foo(b); // get lock on a in this thread
        System.out.println("Back in main thread");
    }
    public void run(){
        b.bar(a);
        System.out.println("Back in racing thread");
    }
    public static void main(String args[]){
        new DeadLock();
    }
}
