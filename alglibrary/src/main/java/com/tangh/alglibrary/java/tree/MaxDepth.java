package com.tangh.alglibrary.java.tree;

/**
 * 104. 二叉树的最大深度
 * 难度
 * 简单
 * <p>
 * 给定一个二叉树，找出其最大深度。
 * <p>
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回它的最大深度 3 。
 */
public class MaxDepth {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int heightLeft = maxDepth(root.left);
        int heightRight = maxDepth(root.right);

        return Math.max(heightLeft, heightRight) + 1;
    }

}
