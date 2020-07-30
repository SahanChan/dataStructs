package SelectionSort;

class SelectSortArray {
    private long[] arr;
    private int nElems;

    public SelectSortArray(int maxSize) {
        arr = new long[maxSize];
        nElems = 0;
    }

    public void insert(long value) {
        arr[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public void selectionSort() {
        int out, in, min;
        for (out = 0; out < nElems; out++) {
            min = out;
            for (in = out + 1; in < nElems; in++) {
                if (arr[in] < arr[min]) {
                    min = in;

                }

            }
            swap(out, min);

        }
    }

    private void swap(int one, int two) {
        long temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}