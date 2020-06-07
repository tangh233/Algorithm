package com.tangh.alglibrary.java.tree;

/**
 * 101. 对称二叉树
 * 难度
 * 简单
 * <p>
 * 反馈
 * 给定一个二叉树，检查它是否是镜像对称的。
 * <p>
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 * <p>
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 * <p>
 * 进阶：
 * 你可以运用递归和迭代两种方法解决这个问题吗？
 */
public class IsSymmetric {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.left.left = new TreeNode(3);
        p.left.right = new TreeNode(4);
        p.right = new TreeNode(2);
        p.right.left = new TreeNode(4);
        p.right.right = new TreeNode(3);

        new IsSymmetric().isSymmetric(p);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        return isSame(root.left, root.right);
    }


    public boolean isSame(TreeNode p, TreeNode q) {

        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        if (p.val != q.val) return false;

        return isSame(p.left, q.right) && isSame(p.right, q.left);

    }
}
