package interthreadcommunication;

public class ProducerConsumerDemo {
    public static void main(String args[]){
        Queue queue = new Queue();
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
    }
}
