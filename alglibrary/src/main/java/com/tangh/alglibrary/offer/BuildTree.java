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

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = new TreeNode(preorder[0]);


        HashMap<Integer, Integer> preOrderHashMap = new HashMap();
        for (int i = 0; i < preorder.length; i++) {
            preOrderHashMap.put(preorder[i], i);
        }
        HashMap<Integer, Integer> inorderHashMap = new HashMap();
        for (int i = 0; i < inorder.length; i++) {
            inorderHashMap.put(inorder[i], i);
        }

        Integer index = inorderHashMap.get(preorder[0]);

        root.left = buildTree(root, inorderHashMap);

        return root;
    }

    public TreeNode buildTree(TreeNode root, HashMap inorderHashMap, int[] preorder, int[] inorder) {
        if()

        root.left = buildTree(root, inorderHashMap, preorder, inorder);
        root.right = buildTree(root, inorderHashMap, preorder, inorder);

        return root;
    }

    public void traversal(TreeNode node) {
//        node.val;
        traversal(node.left);
        traversal(node.right);
    }
}
