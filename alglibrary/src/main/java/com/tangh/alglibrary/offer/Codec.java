package com.tangh.alglibrary.offer;

import com.tangh.alglibrary.java.tree.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 剑指 Offer 37. 序列化二叉树
 * 请实现两个函数，分别用来序列化和反序列化二叉树。
 * <p>
 * 示例:
 * <p>
 * 你可以将以下二叉树：
 * <p>
 * 1
 * / \
 * 2   3
 * / \
 * 4   5
 * <p>
 * 序列化为 "[1,2,3,null,null,4,5]"
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list.toString();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                list.add(node.val);
                queue.offer(node.left);
                queue.offer(node.right);

            } else {
                list.add(null);
            }
        }

        return list.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("[]")) return null;

        data = data.replace("[", "");
        data = data.replace("]", "");

        String[] split = data.split(",");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(new TreeNode(Integer.parseInt(split[0])));
        int index = 0;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            queue.offer(node.left);
            queue.offer(node.right);
        }

        return null;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(4);
        treeNode.right.right = new TreeNode(5);
        String serialize = new Codec().serialize(treeNode);
        System.out.println(serialize);

    }


}