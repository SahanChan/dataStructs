package InsertionSortJava;

public class insertionSort {

    private long[] arr;
    private int nElems;

    public insertionSort(int max) {
        arr = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        arr[nElems] = value;
        nElems++;
    }

    public void insertionSort() {
        int in, out;
        for (out = 1; out < nElems; out++) {
            long temp = arr[out];
            in = out;
            while (in > 0 && arr[in - 1] >= temp) {
                arr[in] = arr[in - 1];
                --in;
            }
            arr[in] = temp;

        }
    }

}