package com.tangh.alglibrary.offer;

import com.tangh.alglibrary.java.link.ListNode;

/**
 * 剑指 Offer 22. 链表中倒数第k个节点
 * <p>
 * 示例：
 * <p>
 * 给定一个链表: 1->2->3->4->5, 和 k = 2.
 * <p>
 * 返回链表 4->5.
 */
public class GetKthFromEnd {

    public ListNode getKthFromEnd(ListNode head, int k) {
        if (k < 1) return null;

        ListNode slowNode = head;
        ListNode fastNode = head;

        while (fastNode.next != null) {
            if (k > 1) {
                k--;
            } else {
                slowNode = slowNode.next;
            }
            fastNode = fastNode.next;
        }

        return slowNode;
    }

//    public ListNode getKthFromEnd(ListNode head, int k) {
//        ListNode node = head;
//        int size = 0;
//        while (node != null) {
//            size++;
//            node = node.next;
//        }
//
//        int index = size - k;
//        while (head != null) {
//            if (index == 0) return head;
//
//            index--;
//            head = head.next;
//        }
//
//
//        return null;
//    }
}
