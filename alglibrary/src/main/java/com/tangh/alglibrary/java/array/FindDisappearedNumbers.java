package com.tangh.alglibrary.java.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * 448. 找到所有数组中消失的数字
 * 难度
 * 简单
 * <p>
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 * <p>
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 * <p>
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [4,3,2,7,8,2,3,1]
 * <p>
 * 输出:
 * [5,6]
 */
public class FindDisappearedNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashSet set = new HashSet();
        for (int i : nums) {
            set.add(i);
        }

        for (int j = 1; j <= nums.length; j++) {
            if (!set.contains(j)) list.add(j);
        }
        return list;
    }

    public List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            nums[index] = Math.abs(nums[index]) * -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0) list.add(nums[i]);
        }

        return list;
    }
}
