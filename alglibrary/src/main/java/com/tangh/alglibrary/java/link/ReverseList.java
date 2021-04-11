package com.tangh.alglibrary.java.link;

import java.util.Stack;

/**
 * 206. 反转链表
 * <p>
 * 反转一个单链表。
 * 示例:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
public class ReverseList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        ListNode tmpNode = new ReverseList().reverseList3(listNode);
        while (tmpNode != null) {

            System.out.print(tmpNode.val + "-");
            tmpNode = tmpNode.next;
        }
    }

    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode tmp = cur.next;

            cur.next = pre;
            pre = cur;
            cur = tmp;
        }

        return pre;
    }

    public ListNode reverseList2(ListNode head) {

        Stack<ListNode> stack = new Stack();

        while (head != null) {
            stack.push(head);

            head = head.next;
        }

        ListNode newHead = new ListNode(-1);
        ListNode tmpHead = newHead;
        while (!stack.isEmpty()) {
            ListNode node = stack.pop();
            tmpHead.next = node;
            tmpHead = tmpHead.next;
        }

        tmpHead.next = null;


        return newHead.next;
    }

    public ListNode reverseList3(ListNode head) {

        ListNode preNode = null;
        ListNode curNode = head;

        while (head !=null){
            ListNode tmp = head.next;
            curNode.next = preNode;

            preNode = head;
            curNode = tmp;

            head = tmp;
        }

        return preNode;
    }
}
