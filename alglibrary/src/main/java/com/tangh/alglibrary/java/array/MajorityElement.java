package com.tangh.alglibrary.java.array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 169. 多数元素
 * 难度
 * 简单
 * <p>
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 */
public class MajorityElement {

    public static void main(String[] args) {

        int[] nums = {6,5,5};
        new MajorityElement().majorityElement3(nums);
    }

    public int majorityElement(int[] nums) {
        float a = nums.length / 2f;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                int n = map.get(i) + 1;
                map.put(i, n);
            } else map.put(i, 1);

            if (map.get(i) > a) return i;
        }
        return -1;
    }

    public int majorityElement2(int[] nums) {
        Arrays.sort(nums);

        return nums[nums.length / 2];
    }

    public int majorityElement3(int[] nums) {
        int count = 0;
        int tmpN = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) tmpN = nums[i];

            count += tmpN == nums[i] ? 1 : -1;
        }

        return tmpN;
    }
}
