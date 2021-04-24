package com.tangh.alglibrary.hot100.link;

import java.util.Stack;

/**
 * 234. 回文链表
 * 难度
 * 简单
 * <p>
 * 950
 * <p>
 * <p>
 * 请判断一个链表是否为回文链表。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 * <p>
 * 输入: 1->2->2->1
 * 输出: true
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 */
public class IsPalindrome {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        new IsPalindrome().isPalindrome(listNode);
    }


    public boolean isPalindrome(ListNode head) {

        ListNode origin = copyNode(head);

        ListNode preNode = null;
        ListNode curNode = head;
        while (curNode != null) {
            ListNode tmp = curNode.next;

            curNode.next = preNode;

            preNode = curNode;
            curNode = tmp;
        }

        while (origin != null){
            if(preNode.val != origin.val) return false;

            preNode = preNode.next;
            origin = origin.next;
        }

        return true;

    }

    public ListNode copyNode(ListNode head) {
        ListNode preNode = new ListNode(-1);

        ListNode curNode = preNode;
        ListNode tmpNode = head;
        while (tmpNode != null){
            curNode.next = new ListNode(tmpNode.val);

            curNode = curNode.next;
            tmpNode = tmpNode.next;
        }
        return preNode.next;
    }
}
