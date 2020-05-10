package com.tangh.alglibrary.java.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 136. 只出现一次的数字
 * 难度
 * 简单
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * <p>
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {

        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;

    }

    public int singleNumber2(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else set.add(nums[i]);
        }
        return (int) set.toArray()[0];

    }
}
