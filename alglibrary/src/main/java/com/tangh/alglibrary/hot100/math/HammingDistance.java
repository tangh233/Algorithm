package com.tangh.alglibrary.hot100.math;

/**
 * 461. 汉明距离
 * 难度
 * 简单
 * <p>
 * 398
 * <p>
 * <p>
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 * 注意：
 * 0 ≤ x, y < 231.
 * 示例:
 * 输入: x = 1, y = 4
 * <p>
 * 输出: 2
 * <p>
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ↑   ↑
 * <p>
 * 上面的箭头指出了对应二进制位不同的位置。
 */
public class HammingDistance {
    public static void main(String[] args) {
        int i = new HammingDistance().hammingDistance2(1, 4);
        System.out.println(i);

    }

    public int hammingDistance2(int x, int y) {
        int res = x ^ y;
        int count = 0;

        while (res != 0){
            if((res & 1) == 1){
                count++;
            }

            res = res >> 1;
        }


        return count;
    }

    public int hammingDistance(int x, int y) {
        int res = x ^ y;

        return Integer.bitCount(res);
    }
}
