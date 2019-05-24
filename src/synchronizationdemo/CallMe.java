package synchronizationdemo;

public class CallMe {
    private String message; // the shared resource
    synchronized public void call(String message){ // remove synchronized keyword to see abnormal behavior
        this.message = message;
        System.out.println("[" + message);
        try{
            Thread.sleep(500);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("]");
    }
}
