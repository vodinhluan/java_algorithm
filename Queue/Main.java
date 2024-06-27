package Queue;

public class Main {

    public static void main(String[] args) {

        Queue myQueue = new Queue(4);

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        System.out.println("\nQueue:");
        myQueue.printQueue();

        myQueue.Enqueue(9);
        myQueue.Enqueue(22);
        System.out.println("\nEnqueue:");
        myQueue.printEnQueue();

        myQueue.DeQueue();
        System.out.println("\nDequeue:");
        myQueue.printEnQueue();

    }

}

