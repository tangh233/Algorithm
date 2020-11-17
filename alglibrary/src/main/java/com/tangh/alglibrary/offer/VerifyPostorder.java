package com.tangh.alglibrary.offer;

/**
 * 剑指 Offer 33. 二叉搜索树的后序遍历序列
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。
 * 假设输入的数组的任意两个数字都互不相同。
 * <p>
 * 参考以下这颗二叉搜索树：
 * 5
 * / \
 * 2   6
 * / \
 * 1   3
 * 示例 1：
 * <p>
 * 输入: [1,6,3,2,5]
 * 输出: false
 * <p>
 * 示例 2：
 * 输入: [1,3,2,6,5]
 * 输出: true
 * <p>
 * <p>
 * 提示：
 * <p>
 * 数组长度 <= 1000
 */
public class VerifyPostorder {
    public boolean verifyPostorder(int[] postorder) {
        return isVerify(postorder, 0, postorder.length);

    }

    private boolean isVerify(int[] postorder, int start, int end) {
        if (start >= end) return true;

        int root = postorder[end - 1];
        int index = start;
        for (int i = start; i < end; i++) {
            if (postorder[i] > root) {
                index = i;
                break;
            }else{
                index = i;
            }
        }

        for (int i = index; i < end; i++) {
            if (postorder[i] < root) {
                return false;
            }
        }

        boolean left = isVerify(postorder, start, index);
        boolean right = isVerify(postorder, index, end - 1);

        return left && right;
    }

    public static void main(String[] args) {
        new VerifyPostorder().verifyPostorder(new int[]{4,6,7,5});
    }
}
