package com.tangh.alglibrary.offer;

import com.tangh.alglibrary.java.tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.DelayQueue;

/**
 * 剑指 Offer 34. 二叉树中和为某一值的路径
 * 输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
 * <p>
 * 示例:
 * 给定如下二叉树，以及目标和 sum = 22，
 * 5
 * / \
 * 4   8
 * /   / \
 * 11  13  4
 * /  \    / \
 * 7    2  5   1
 * 返回:
 * <p>
 * [
 * [5,4,11,2],
 * [5,8,4,5]
 * ]
 * <p>
 * 提示：
 * <p>
 * 节点总数 <= 10000
 */
public class PathSum {
    LinkedList<Integer> list = new LinkedList<>();
    List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return new ArrayList<>();
        helper(root, sum);

        return lists;
    }


    private void helper(TreeNode root, int sum) {
        if (root == null) return;

        list.add(root.val);
        sum = sum - root.val;
        if (sum == 0 && root.left == null && root.right == null) {
            lists.add(new LinkedList(list));
        }

        helper(root.left, sum);
        helper(root.right, sum);

        list.removeLast();

    }


//    public List<List<Integer>> pathSum(TreeNode root, int sum) {
//        List<List<Integer>> lists = new ArrayList<>();
//        LinkedList<Integer> list = new LinkedList<>();
//
//        Stack<TreeNode> stack = new Stack<>();
//
//        while (!stack.isEmpty() || root != null) {
//            if (root != null) {
//                list.add(root.val);
//                stack.push(root);
//                root = root.left;
//            } else {
//                TreeNode node = stack.pop();
//                if (node.left == null && node.right == null) {
//                    lists.add(new LinkedList(list));
//                }
//                root = node.right;
//
//            }
//
//        }
//
//        System.out.println(lists);
//
//
//        return null;
//    }


    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
//        node.right.left = new TreeNode(6);
//        node.right.right = new TreeNode(7);

        new PathSum().pathSum(node, 1);

    }
}
