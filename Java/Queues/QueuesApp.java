package Java.Queues;

public class QueuesApp {
    public static void main(String[] args) {
        Queues theQueue = new Queues(5);
        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);
        theQueue.remove();
        theQueue.remove();
        theQueue.remove();

        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);

        while (!theQueue.isEmpty()) {
            long n = theQueue.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");
    }

}