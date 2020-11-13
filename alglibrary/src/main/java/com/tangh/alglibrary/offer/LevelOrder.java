package com.tangh.alglibrary.offer;

import com.tangh.alglibrary.java.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 剑指 Offer 32 - I. 从上到下打印二叉树
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 * <p>
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回：
 * [3,9,20,15,7]
 * <p>
 * 提示：
 * 节点总数 <= 1000
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<List<Integer>> notes = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode note = queue.poll();
                list.add(note.val);

                if (note.left != null) queue.offer(note.left);
                if (note.right != null) queue.offer(note.right);
            }

            notes.add(list);
        }
        return notes;
    }


//    public int[] levelOrder(TreeNode root) {
//
//        List<Integer> list =new ArrayList<>();
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while (!queue.isEmpty()) {
//            TreeNode node = queue.poll();
//            System.out.println(node.val);
//            list.add(node.val);
//
//            if (node.left != null) queue.add(node.left);
//            if (node.right != null) queue.add(node.right);
//        }
//
//        int[] val=new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            val[i] = list.get(i);
//        }
//
//        return val;
//    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
        new LevelOrder().levelOrder(node);
    }
}
