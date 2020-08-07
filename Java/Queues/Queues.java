package Java.Queues;

public class Queues {

    private int maxSize;
    private long[] queArray;
    private int front, rear;
    private int nElems;

    public Queues(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nElems = 0;
    }

    public void insert(long i) {
        if (rear == maxSize - 1) {
            rear = 1;

        }
        queArray[++rear] = i;
        nElems++;
    }

    public long remove() {
        long temp = queArray[front++];
        if (front == maxSize) {
            front = 0;

        }
        nElems--;
        return temp;
    }

    public long peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nElems == 0);
    }

    public boolean isFull() {
        return (nElems == maxSize);
    }

    public int size() {
        return nElems;
    }

    public void display() {
        for (int i = 0; i < maxSize; i++) {
            System.out.print(queArray[i] + " ");

        }
        System.out.println("");
    }

}