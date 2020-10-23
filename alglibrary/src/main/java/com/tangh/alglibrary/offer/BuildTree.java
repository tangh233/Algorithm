package com.tangh.alglibrary.offer;

import com.tangh.alglibrary.java.tree.TreeNode;

import java.util.HashMap;

/*
 * 剑指 Offer 07. 重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *
 *
 *
 * 例如，给出
 *
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 *
 * 限制：
 *
 * 0 <= 节点个数 <= 5000
 *
 *
 *
 * 注意：本题与主站 105 题重复：https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 */
public class BuildTree {
    public static void main(String[] args) {
        int[] pre = new int[]{1, 2, 4, 5, 3};
        int[] in = new int[]{4, 2, 5, 1, 3};
        new BuildTree().buildTree(pre, in);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            hashMap.put(inorder[i], i);
        }
        return buildTree(preorder, inorder, hashMap, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder, HashMap<Integer, Integer> inorderHashMap, int preLeft, int preRight, int inLeft, int inRight) {
        if (preLeft > preRight || inLeft > inRight) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preLeft]);
        int index = inorderHashMap.get(preorder[preLeft]);

        root.left = buildTree(preorder, inorder, inorderHashMap, preLeft + 1, index - inLeft + preLeft, inLeft, index - 1);
        root.right = buildTree(preorder, inorder, inorderHashMap, index - inLeft + preLeft + 1, preRight, index + 1, inRight);


        return root;
    }


}
