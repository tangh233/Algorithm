package com.tangh.alglibrary.offer;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 剑指 Offer 39. 数组中出现次数超过一半的数字
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
 * 输出: 2
 * <p>
 * 限制：
 * <p>
 * 1 <= 数组长度 <= 50000
 * <p>
 * 注意：本题与主站 169 题相同：https://leetcode-cn.com/problems/majority-element/
 */
public class MajorityElement {
    /**
     * 摩尔投票
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int count = 0;
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) num = nums[i];
            count += (num == nums[i]) ? 1 : -1;
        }

        return num;
    }


//    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length/2];
//    }


//    public int majorityElement(int[] nums) {
//        if (nums.length == 0) return 0;
//        if (nums.length == 1) return nums[0];
//
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (hashMap.containsKey(nums[i])) {
//                int num = hashMap.get(nums[i]) + 1;
//
//                if (num > nums.length / 2) {
//                    return nums[i];
//                }
//                hashMap.put(nums[i], num);
//            } else {
//                hashMap.put(nums[i], 1);
//            }
//        }
//
//        return 0;
//    }

    public static void main(String[] args) {
        new MajorityElement().majorityElement(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2});
    }
}
