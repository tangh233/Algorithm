package com.tangh.alglibrary.java.array;

/**
 * 35. 搜索插入位置
 * <p>
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 你可以假设数组中无重复元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 * <p>
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 * <p>
 * 输入: [1,3,5,6], 0
 * 输出: 0
 */
public class SearchInsert {
    public static void main(String[] args) {
        int[] i = {1, 3, 5, 6};
        searchInsert3(i,2);
    }

    /**
     * O（N）
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {

        if (nums == null || target < nums[0]) return 0;

        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) return i;
        }
        return nums.length;
    }

    /**
     * O（N）
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert2(int[] nums, int target) {

        if (nums == null) return -1;
        if (target < nums[0]) return 0;
        if (target > nums[nums.length - 1]) return nums.length;

        for (int i = 0; i < nums.length / 2 + 1; i++) {
            int j = nums.length - 1 - i;
            if (target <= nums[i]) return i;
            if (target > nums[j]) return j + 1;
            if (target == nums[j]) return j;
        }
        return -1;
    }


    /**
     * logN
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert3(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int index = (left + right) / 2;
            if (target == nums[index]) return index;
            else if (target < nums[index]) right = index-1;
            else left = index+1;
        }

        return left;

    }


}
