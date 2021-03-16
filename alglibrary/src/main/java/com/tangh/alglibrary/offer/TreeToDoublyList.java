package com.tangh.alglibrary.offer;

import com.tangh.alglibrary.java.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 36. 二叉搜索树与双向链表
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。要求不能创建任何新的节点，只能调整树中节点指针的指向。
 * 特别地，我们希望可以就地完成转换操作。当转化完成以后，树中节点的左指针需要指向前驱，树中节点的右指针需要指向后继。还需要返回链表中的第一个节点的指针。
 */

public class TreeToDoublyList {

    Node pre, head;

    public Node treeToDoublyList(Node root) {
        pre = null;
        head = null;
        dfs(root);

        pre.right = head;
        head.left = pre;

        return head;
    }


    private void dfs(Node curr) {
        if (curr != null) {
            dfs(curr.left);


            if (pre != null) {
                pre.right = curr;
                curr.left = pre;
            } else {
                head = curr;
            }
            pre = curr;

            dfs(curr.right);
        }
    }

//    public Node treeToDoublyList(Node root) {
//        List<Node> list = new ArrayList<>();
//        dfs(root, list);
//
//        Node head = list.get(0);
//        Node tail = list.get(list.size() - 1);
//        for (int i = 0; i < list.size(); i++) {
//
//            Node tmp = list.get(i);
//
//            tmp.left = i == 0 ? tail : list.get(i - 1);
//            tmp.right = (i == list.size() - 1) ? head : list.get(i + 1);
//
//        }
//
//        return root;
//    }
//
//    private void dfs(Node root, List<Node> list) {
//        if (root != null) {
//            dfs(root.left, list);
//            list.add(root);
//            dfs(root.right, list);
//        }
//    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(5);
        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(3);
//        new TreeToDoublyList().treeToDoublyList(treeNode);
    }


    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }


}


