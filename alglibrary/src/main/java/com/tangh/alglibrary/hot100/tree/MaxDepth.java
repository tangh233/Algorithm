package com.tangh.alglibrary.hot100.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 104. 二叉树的最大深度
 * 难度
 * 简单
 * <p>
 * 857
 * <p>
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
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);

        int i = new MaxDepth().maxDepth(treeNode);
        System.out.println(i);
    }


    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }

}
