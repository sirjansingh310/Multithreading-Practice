package deadlock;

public class B {
    synchronized void bar(A a){
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered B.bar");
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(name + " trying to call a.last"); // can't because another thread has entered A.foo, which is a synchronized method. a.last is also a synchronized method so it is also locked
        a.last();
    }
    synchronized void last(){
        System.out.println("Entered B.last");
    }
}
