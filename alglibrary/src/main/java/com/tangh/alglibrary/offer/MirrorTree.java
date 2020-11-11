package com.tangh.alglibrary.offer;

import com.tangh.alglibrary.java.tree.TreeNode;

public class MirrorTree {
    public TreeNode mirrorTree(TreeNode root) {
        if (root != null) {
            mirrorTree(root.left);
            mirrorTree(root.right);
            swapTree(root);
        }
        return root;
    }

    private void swapTree(TreeNode root) {
        if (root.left != null || root.right != null) {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
        }
    }

    public static void main(String[] args) {

    }
}
