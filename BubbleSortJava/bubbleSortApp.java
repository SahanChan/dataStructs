package BubbleSortJava;

class BubbleSortApp {
    public static void main(String[] args) {
        int maxSize = 10;
        ArrayBub arr = new ArrayBub(maxSize);
        arr.insert(10);
        arr.insert(44);
        arr.insert(22);
        arr.insert(33);
        arr.insert(55);
        arr.insert(66);
        arr.insert(88);
        arr.insert(99);
        arr.insert(77);
        arr.insert(101);
        arr.display();
        arr.bubbleSort();
        arr.display();
    }
}