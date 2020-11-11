package com.tangh.alglibrary.offer;

import com.tangh.alglibrary.java.link.ListNode;

public class DeleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) return head.next;

        ListNode node = head;
        ListNode preNode = null;
        while (node != null) {
            if (node.val == val) {
                preNode.next = node.next;
                return head;
            }
            preNode = node;
            node = node.next;
        }


        return head;
    }
}
