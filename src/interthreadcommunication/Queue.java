package interthreadcommunication;

public class Queue {
    int n = 0;
    boolean value = false;
    synchronized public int get(){
        while(!value) { // recommended to put wait() inside a for loop with a boolean condition. There is a slight possibility that waiting will stop without a notification(this is called spurious wait)
            try {
                wait(); // wait for producer to put
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.println("Got " + this.n);
            value = false; // notify others, I will wait.
            notify(); // notify other thread that is waiting on the same object, i.e producer. notify will notify only 1 thread whereas notifyAll will notify all threads waiting for this object.(but only 1 will get access)
            return n;

    }
    synchronized public void put(int n){
        while(value) {
            try {
                wait(); // wait for consumer to get
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            this.n = n;
            value = true;
            System.out.println("Put " + this.n);
            notify();

    }
}
