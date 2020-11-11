package com.tangh.alglibrary.offer;

public class PrintNumbers {
    public int[] printNumbers(int n) {
        if (n <= 0) return null;

        int max = 1;
        for (int i = 1; i <= n; i++) {
            max *= 10;
        }

        int[] nums = new int[max - 1];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+1;
        }

        return nums;
    }
}
