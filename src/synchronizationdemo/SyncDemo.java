package synchronizationdemo;

public class SyncDemo {
    public static void main(String args[]){
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
