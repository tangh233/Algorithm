package com.tangh.alglibrary.java.array;

/**
 * 二分查找
 */
public class Search {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
//        int res = new Search().search(2, nums, 0, nums.length - 1);
        int res = new Search().search(2, nums);
        System.out.println(res);
    }

    public int search(int key, int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int index = (left + right) / 2;

            if (nums[index] < key) {
                left = index + 1;
            } else if (nums[index] > key) {
                right = index;
            } else {
                return index;
            }
        }

        return -1;
    }

    public int search(int key, int[] nums, int start, int end) {

        int index = (start + end) / 2;

        if (index < 0 || start > end) return -1;

        if (nums[index] < key) {
            return search(key, nums, index + 1, end);
        } else if (nums[index] > key) {
            return search(key, nums, start, index);
        } else {
            return index;
        }
    }
}
