package com.tangh.alglibrary.offer;

public class Sort {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 7, 2, 9, 2, 1, 0, 5};
        new Sort().quickSort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.print(i + "-");
        }
    }

    public void quickSort(int[] array, int start, int end) {

        int index = partition(array, start, end);
        if (index > start) {
            quickSort(array, start, index - 1);
        }

        if (index < end) {
            quickSort(array, index + 1, end);
        }

    }

    private int partition(int[] array, int start, int end) {

        int p = start-1;
        for (int i = start; i <= end; i++) {
            if (array[i] < array[end]) {
                p++;

                if (i > p)
                    swap(p, i, array);
            }
        }

        swap(p + 1, end, array);

        return p + 1;
    }

    private void swap(int p, int i, int[] array) {
        int tmp = array[p];
        array[p] = array[i];
        array[i] = tmp;
    }
}
