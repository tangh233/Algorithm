package com.tangh.alglibrary.hot100.dp;

/**
 * 53. 最大子序和
 * 难度
 * 简单
 * <p>
 * 3145
 * <p>
 * <p>
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
 * 示例 2：
 * <p>
 * 输入：nums = [1]
 * 输出：1
 * 示例 3：
 * <p>
 * 输入：nums = [0]
 * 输出：0
 * 示例 4：
 * <p>
 * 输入：nums = [-1]
 * 输出：-1
 * 示例 5：
 * <p>
 * 输入：nums = [-100000]
 * 输出：-100000
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums =new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int i = new MaxSubArray().maxSubArray2(nums);
        System.out.println(i);
    }

    public int maxSubArray2(int[] nums){
        int curMax = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            curMax = Math.max(nums[i],curMax+nums[i]);
            maxSum = Math.max(maxSum,curMax);
        }
        return maxSum;
    }

    public int maxSubArray(int[] nums) {
        if(nums == null) return 0;
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        int curMax = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            curMax = Math.max(curMax + nums[i], nums[i]);
            maxSum = Math.max(maxSum, curMax);
        }

        return maxSum;
    }
}
