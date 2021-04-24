package com.tangh.alglibrary.hot100.math;

import java.util.Arrays;

/**
 * 169. 多数元素
 * 难度
 * 简单
 * <p>
 * 963
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：[3,2,3]
 * 输出：3
 * 示例 2：
 * <p>
 * 输入：[2,2,1,1,1,2,2]
 * 输出：2
 * <p>
 * <p>
 * 进阶：
 * <p>
 * 尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。
 */
public class MajorityElement {
    public static void main(String[] args) {
        new MajorityElement().majorityElement(new int[]{2, 3, 3});
    }

    public int majorityElement2(int[] nums) {
        int num = 0;
        int count = 0;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                num = nums[i];
                count++;
                continue;
            }

            if (num == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        return num;

    }


    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        return nums[nums.length / 2];
    }
}
