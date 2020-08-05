package Java.StacksJava;

public class StackApp {
    private long[] stackArray;
    private int maxSize;
    private int top;

    public StackApp(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long i) {
        stackArray[++top] = i;
    }

    public long peek() {
        return stackArray[top];
    }

    public long pop() {
        return stackArray[top--];
    }

}