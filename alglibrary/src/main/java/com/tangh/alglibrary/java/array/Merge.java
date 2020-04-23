package com.tangh.alglibrary.java.array;

import java.util.Arrays;

/**
 * 88. 合并两个有序数组
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * <p>
 * 说明:
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * <p>
 * <p>
 * 示例:
 * <p>
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 */
public class Merge {
    public static void main(String[] args) {
        int[] p1={1,2,3,0,0,0};
        int[] p2={2,5,6};
        merge(p1,p1.length,p2,p2.length);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tmp = new int[m + n];

        int i = 0, j = 0;
        while (i < m && j < n) {
            int tmpNum = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
            tmp[i + j - 1] = tmpNum;
        }

        for (int k = 0; k < tmp.length; k++) {
            nums1[k] = tmp[k];
        }
    }
}
