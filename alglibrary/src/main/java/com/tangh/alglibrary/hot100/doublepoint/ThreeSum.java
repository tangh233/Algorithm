package com.tangh.alglibrary.hot100.doublepoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 三数之和
 * 难度
 * 中等
 * <p>
 * 3242
 * <p>
 * 收藏
 * <p>
 * 分享
 * 切换为英文
 * 接收动态
 * 反馈
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 * 示例 2：
 * <p>
 * 输入：nums = []
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：nums = [0]
 * 输出：[]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 <= nums.length <= 3000
 * -105 <= nums[i] <= 105
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int a = nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int result = nums[left] + nums[right] + a;

                if (result < 0) {
                    left++;
                } else if (result > 0) {
                    right--;
                } else {
                    List<Integer> array = new ArrayList<>();
                    array.add(a);
                    array.add(nums[left]);
                    array.add(nums[right]);
                    list.add(array);

                    left++;
                    right--;

                    while (nums[left] == nums[left - 1] && left < right) left++;
                    while (nums[right] == nums[right + 1] && left < right) right--;

                }


            }

        }


        return list;
    }


    public static void main(String[] args) {
//        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] nums = {-2, 0, 0, 2, 2};
        List<List<Integer>> lists = new ThreeSum().threeSum(nums);
        System.out.println(lists);
//        for (List<Integer> list : lists) {
//            System.out.println(list);
//        }
    }
}
