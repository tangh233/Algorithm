package com.tangh.alglibrary.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 350. 两个数组的交集 II
 * <p>
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 示例 1:
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 * 示例 2:
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [4,9]
 * 说明：
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 * 进阶:
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 */
public class Intersect {
    public static void main(String[] args) {

    }

    public int[] intersect2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;
        List<Integer> list = new LinkedList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] is=new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            is[k]=list.get(k);
        }

        return is;

    }

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int n : nums1) {
            if (hashMap.containsKey(n)) {
                int sum = hashMap.get(n) + 1;
                hashMap.put(n, sum);
            } else hashMap.put(n, 1);
        }

        for (int n2 : nums2) {
            if (hashMap.containsKey(n2) && hashMap.get(n2) > 0) {
                hashMap.put(n2, hashMap.get(n2) - 1);
                list.add(n2);
            }
        }

        int[] is = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            is[k] = list.get(k);
        }

        return is;
    }
}
