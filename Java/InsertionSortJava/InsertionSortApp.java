package Java.InsertionSortJava;

public class InsertionSortApp {

    public static void main(String[] args) {
        int maxSize = 100;
        InsertionSort arr;
        arr = new InsertionSort(maxSize);
        // for (int i = 0; i < 100; i++) {
        // arr.insert((int) Math.random() * 100);
        // }
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.display();

        arr.insertionSort();
        arr.display();

    }

}