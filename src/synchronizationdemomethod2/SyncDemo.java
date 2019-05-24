package synchronizationdemomethod2;

public class SyncDemo {
    public static void main(String args[]){
//        While creating synchronized methods within classes that you create is an easy and effective
//        means of achieving synchronization, it will not work in all cases. To understand why, consider
//        the following. Imagine that you want to synchronize access to objects of a class that was not
//        designed for multithreaded access. That is, the class does not use synchronized methods.(ex some classes that are not "ThreadSafe")
//        Further, this class was not created by you, but by a third party, and you do not have access to
//        the source code. Thus, you can’t add synchronized to the appropriate methods within the
//        class. How can access to an object of this class be synchronized? Fortunately, the solution to
//        this problem is quite easy: You simply put calls to the methods defined by this class inside a
//        synchronized block.
        CallMe target = new CallMe();
        CallerThread callerThreads[] = new CallerThread[3];
        callerThreads[0] = new CallerThread(target,"hello");
        callerThreads[1] = new CallerThread(target,"synchronized");
        callerThreads[2] = new CallerThread(target,"world");
        try{
            callerThreads[0].thread.join();
            callerThreads[1].thread.join();
            callerThreads[2].thread.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
