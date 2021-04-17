package com.tangh.alglibrary.hot100.doublepoint;

/**
 * 11. 盛最多水的容器
 * 难度
 * 中等
 * <p>
 * 2381
 * <p>
 * 收藏
 * <p>
 * 分享
 * 切换为英文
 * 接收动态
 * 反馈
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 说明：你不能倾斜容器。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 * 解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
 * 示例 2：
 * <p>
 * 输入：height = [1,1]
 * 输出：1
 * 示例 3：
 * <p>
 * 输入：height = [4,3,2,1,4]
 * 输出：16
 * 示例 4：
 * <p>
 * 输入：height = [1,2,1]
 * 输出：2
 * <p>
 * <p>
 * 提示：
 * <p>
 * n = height.length
 * 2 <= n <= 3 * 104
 * 0 <= height[i] <= 3 * 104
 */
public class MaxArea {
    public static void main(String[] args) {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
//        int[] height = new int[]{1, 1};
        int i = new MaxArea().maxArea(height);
        System.out.println(i);
    }

    public int maxArea(int[] height) {
        if (height == null) return 0;
        if (height.length <= 1) return 0;

        int maxArea = 0;

        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, h * (right - left));

            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;

    }


    private int getIndexMax(int[] height, int index, int maxHeightIndex) {

        int maxArea = 0;

        int h = Math.min(height[maxHeightIndex], height[index]);

        int h2 = Math.min(height[0], height[index]);
        maxArea = Math.max(h * (index - maxHeightIndex), h2 * index);

        return maxArea;
    }

    private int getIndexMax(int[] height, int index) {

        int maxArea = 0;
        int currHeight = height[index];

        for (int i = 0; i < index; i++) {
            int min = Math.min(height[i], currHeight);
            int area = min * (index - i);

            maxArea = Math.max(maxArea, area);

        }
        return maxArea;
    }


}
