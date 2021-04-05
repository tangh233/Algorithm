package com.tangh.alglibrary.java.array;

import com.tangh.alglibrary.offer.CQueue;

public class Sort {


    /**
     * 冒泡
     */
    public static void sort1(int[] numbs) {
        for (int i = 0; i < numbs.length; i++) {
            for (int j = 0; j < numbs.length - 1 - i; j++) {
                if (numbs[j + 1] < numbs[j]) {
                    int tmp = numbs[j + 1];
                    numbs[j + 1] = numbs[j];
                    numbs[j] = tmp;
                }
            }
        }

    }

    /**
     * 选择排序
     *
     * @param numbs
     */
    public static void sort2(int[] numbs) {
        for (int i = 0; i < numbs.length; i++) {

            int minIndex = i;
            for (int j = i + 1; j < numbs.length; j++) {

                if (numbs[j] < numbs[minIndex]) {
                    minIndex = j;
                }
            }

            int tmp = numbs[minIndex];
            numbs[minIndex] = numbs[i];
            numbs[i] = tmp;
        }
    }

    /**
     * 插入排序
     *
     * @param numbs
     */
    public static void sort3(int[] numbs) {
        for (int k = 1; k < numbs.length; k++) {
            for (int i = k; i > 0; i--) {
                if (numbs[i] < numbs[i - 1]) {
                    int tmp = numbs[i];
                    numbs[i] = numbs[i - 1];
                    numbs[i - 1] = tmp;
                }
            }
        }

    }


    public static void main(String[] args) {
        sort4(numbs);
        for (int numb : numbs) {
            System.out.print(numb+" ");
        }
    }

    static int[] numbs = new int[]{1, 4, 2, 5, 1, 4, 3, 6};

    /**
     * 快排
     *
     * @param numbs
     */
    private static void sort4(int[] numbs) {

        sort4(numbs,0,numbs.length-1);

    }

    private static void sort4(int[] numbs, int start, int end) {
        if(start >= end) return;

        int baseIndex = quickSort(numbs, start, end);
        sort4(numbs,start,baseIndex - 1);
        sort4(numbs,baseIndex + 1,end);
    }

    private static int quickSort(int[] numbs, int start,int end) {
        int baseIndex = end;
        int baseValue = numbs[baseIndex];
        int left = start;
        int right = baseIndex - 1;

        while (left < right) {
            if (numbs[left] > baseValue && numbs[right] < baseValue) {
                int tmp = numbs[left];
                numbs[left] = numbs[right];
                numbs[right] = tmp;
            }

            if (numbs[left] <= baseValue) {
                left++;
            } else {
                right--;
            }
        }

        if(numbs[left] > numbs[baseIndex]){
            numbs[baseIndex] = numbs[left];
            numbs[left] = baseValue;

            return  left;
        }

        return baseIndex;
    }

}
