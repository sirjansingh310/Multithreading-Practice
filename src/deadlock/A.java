package deadlock;

public class A {
    synchronized void foo(B b){
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered A.foo");
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(name + " trying to call B.last"); // can't because another thread has entered b.bar, which is a synchronized method. b.last is also a synchronized method so it is also locked
        b.last();
    }
    synchronized void last(){
        System.out.println("Entered A.last");
    }
}
