package SelectionSort;

public class selectionSortApp {

    public static void main(String[] args) {
        SelectSortArray array = new SelectSortArray(10);

        array.insert(44);
        array.insert(66);
        array.insert(99);
        array.insert(55);
        array.insert(33);
        array.insert(77);
        array.insert(101);
        array.insert(11);
        array.insert(22);
        array.insert(88);

        array.display();

        array.selectionSort();
        array.display();

    }

}