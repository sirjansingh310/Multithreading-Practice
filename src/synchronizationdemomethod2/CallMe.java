package synchronizationdemomethod2;

public class CallMe {
    private String message; // the shared resource
     public void call(String message){
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
