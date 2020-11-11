package com.tangh.alglibrary.offer;

import com.tangh.alglibrary.java.link.ListNode;


/**
 * 反转链表
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class RverseList {

    public ListNode reverseList(ListNode head) {

        ListNode node = head;
        ListNode preNode = null;

        while (node != null) {
            ListNode tmp = node.next;

            node.next = preNode;
            preNode = node;

            node = tmp;
        }

        return preNode;
    }
}
