package com.tangh.alglibrary.java.array;

/**
 * 53. 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶:
 * <p>
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArray(array);
    }

    public static int maxSubArray(int[] nums) {


        int currNums = nums[0];
        int maxNums = nums[0];
        for (int i = 0; i < nums.length; i++) {
            currNums = Math.max(currNums + nums[i], nums[i]);
            maxNums=Math.max(maxNums,currNums);
        }

        return maxNums;

    }
}
