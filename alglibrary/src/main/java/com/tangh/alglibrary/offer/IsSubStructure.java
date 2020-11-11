package com.tangh.alglibrary.offer;

import com.tangh.alglibrary.java.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 树的子结构
 */
public class IsSubStructure {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        boolean flag = false;
        if (B == null) return false;

        if (A != null) {
            if (A.val == B.val) {
                flag = compareSubTree(A, B);
            }
            if (!flag)
                flag = isSubStructure(A.left, B);

            if (!flag)
                flag = isSubStructure(A.right, B);
        }
        return flag;
    }

    private boolean compareSubTree(TreeNode A, TreeNode B) {
        if (B == null) return true;

        if (A == null) return false;
        if (A.val != B.val) return false;

        return compareSubTree(A.left, B.left) && compareSubTree(A.right, B.right);
    }


    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);

    }
}
