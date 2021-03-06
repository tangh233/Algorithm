package com.tangh.alglibrary.hot100.link;

/**
 * 206. 反转链表
 * 难度
 * 简单
 *
 * 1699
 *
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
public class ReverseList {

    public ListNode reverseList2(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null){
            ListNode tmp = cur.next;

            cur.next = pre;

            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    public ListNode reverseList(ListNode head) {
        ListNode preNode = null;
        ListNode curNode = head;

        while (curNode != null){

            ListNode tmp = curNode.next;

            curNode.next = preNode;

            preNode = curNode;
            curNode = tmp;
        }

        return preNode;
    }
}
