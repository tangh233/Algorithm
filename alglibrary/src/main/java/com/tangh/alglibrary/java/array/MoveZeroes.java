package com.tangh.alglibrary.java.array;

/**
 * 283. 移动零
 * <p>
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 示例:
 * <p>
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 * <p>
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
public class MoveZeroes {
    public static void main(String[] args) {
        new MoveZeroes().moveZeroes(new int[]{1, 2, 0, 3, 4});
    }

    public void moveZeroes2(int[] nums) {
        if (nums.length < 2) return;

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) nums[index++] = nums[i];
        }

        for (int j = index; j < nums.length; j++) {
            nums[j] = 0;
        }
    }

    public void moveZeroes(int[] nums) {
        if (nums.length <= 1) return;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) continue;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0 && nums[j] != 0) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                    break;
                }
            }
        }
    }
}
