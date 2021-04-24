package com.tangh.alglibrary.hot100.array;

/**
 * 283. 移动零
 * 难度
 * 简单
 * <p>
 * 1036
 * <p>
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
        int[] nums = new int[]{0,1,0,3,12};
//        int[] nums = new int[]{0, 0, 1};
        new MoveZeroes().moveZeroes3(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public void moveZeroes3(int[] nums) {
        int slow = 0;
        int fast = 0;

        while (fast < nums.length) {
            if (nums[fast] != 0) {
                int tmp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = tmp;

                slow++;
            }
            fast++;

        }
    }

    public void moveZeroes2(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
        }

        for (int i = pos; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) continue;

            int moveI = i;
            for (int j = moveI + 1; j < nums.length; j++) {
                if (nums[j] == 0) continue;


                nums[moveI] = nums[j];
                nums[j] = 0;
                moveI++;
            }
        }
    }
}
