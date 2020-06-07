package com.tangh.alglibrary.java.tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * 94. 二叉树的中序遍历
 * <p>
 * 给定一个二叉树，返回它的中序 遍历。
 * 示例:
 * 输入: [1,null,2,3]
 * 1
 * \
 * 2
 * /
 * 3
 * <p>
 * 输出: [1,3,2]
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 */
public class InorderTraversal {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.right = new TreeNode(3);
        new InorderTraversal().dfs(treeNode);
    }

    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            list.add(root.val);
            System.out.println(root.val);
            inorderTraversal(root.right);
        }
        return list;
    }


    public List<Integer> bfs(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();

        if (root == null) return null;
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node.val);

            if(node.left!=null) queue.offer(node.left);
            if(node.right!=null) queue.offer(node.right);
        }


        return list;
    }

    public List<Integer> dfs(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();

        if (stack == null) return null;

        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();

            System.out.println(node.val);

            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }
        }


        return list;
    }
}
