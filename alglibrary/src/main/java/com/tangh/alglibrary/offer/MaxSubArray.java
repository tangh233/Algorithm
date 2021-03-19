package com.tangh.alglibrary.offer;

/**
 * 剑指 Offer 42. 连续子数组的最大和
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 * <p>
 * 要求时间复杂度为O(n)。
 * <p>
 * 示例1:
 * <p>
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * <p>
 * 提示：
 * <p>
 * 1 <= arr.length <= 10^5
 * -100 <= arr[i] <= 100
 */
public class MaxSubArray {


    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int tmpSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            tmpSum = Math.max(tmpSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, tmpSum);

        }

        return maxSum;
    }


    public static void main(String[] args) {
        new MaxSubArray().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
    }

}
