package com.tangh.alglibrary.offer;

import com.tangh.alglibrary.java.link.ListNode;

/**
 * 剑指 Offer 25. 合并两个排序的链表
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 * <p>
 * 示例1：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * 限制：
 * <p>
 * 0 <= 链表长度 <= 1000
 */
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(-1);
        ListNode preNode = node;

        while (true) {
            if (l1 == null) {
                node.next = l2;
                return preNode.next;
            }

            if (l2 == null) {
                node.next = l1;
                return preNode.next;
            }

            if (l1.val < l2.val) {
                node.next = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                l2 = l2.next;
            }

            node = node.next;
        }
    }

    public static void main(String[] args) {

    }
}
