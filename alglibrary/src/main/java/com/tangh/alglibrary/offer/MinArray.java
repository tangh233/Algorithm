package com.tangh.alglibrary.offer;

public class MinArray {
    public static void main(String[] args) {
        new MinArray().minArray(new int[]{2,2,2,0,1});
    }
    public int minArray(int[] numbers) {

        if (numbers == null || numbers.length == 0) return -1;
        if (numbers.length == 1) return numbers[0];

        int startIndex = 0;
        int endIndex = numbers.length - 1;


        while (startIndex < endIndex) {
            int midIndex = (startIndex + endIndex) / 2;

            if (numbers[midIndex] > numbers[endIndex]) {
                startIndex = midIndex + 1;
            } else if (numbers[midIndex] < numbers[endIndex]) {
                endIndex = midIndex;
            } else {
                endIndex--;
            }


        }

        return numbers[startIndex];
    }


//    public int minArray(int[] numbers) {
//
//        if (numbers == null || numbers.length == 0) return -1;
//        if (numbers.length == 1) return numbers[0];
//
//        int min = numbers[0];
//
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] < min) {
//                return numbers[i];
//            }
//        }
//
//        return min;
//    }
}
