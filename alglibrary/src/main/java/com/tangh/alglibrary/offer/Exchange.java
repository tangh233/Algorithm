package com.tangh.alglibrary.offer;

/**
 * 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 * <p>
 * 示例：
 * <p>
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,2,4]
 * 注：[3,1,2,4] 也是正确的答案之一。
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 50000
 * 1 <= nums[i] <= 10000
 */
public class Exchange {
    public int[] exchange(int[] nums) {
        int slow = 0;

        for (int i = 0; i < nums.length; i++) {
            int res = nums[i] & 1;
            if (res == 1) {//ji shu
                swap(slow, i, nums);
                slow++;
            }
        }
        return nums;
    }

    private void swap(int slow, int i, int[] nums) {
        if (i == slow) return;

        int tmp = nums[slow];
        nums[slow] = nums[i];
        nums[i] = tmp;
    }
}
