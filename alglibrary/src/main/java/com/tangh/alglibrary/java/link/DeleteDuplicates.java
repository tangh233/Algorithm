package com.tangh.alglibrary.java.link;

/**
 * 83. 删除排序链表中的重复元素
 * <p>
 * <p>
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->1->2
 * 输出: 1->2
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 */
public class DeleteDuplicates {

    public static void main(String[] args) {
        ListNode head = new ListNode(0);

        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        deleteDuplicates(head);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;

        ListNode node = new ListNode(head.val);
        ListNode tmpNode = node;

        while (head != null ) {
            if (tmpNode.val != head.val) {
                tmpNode.next = head;
                tmpNode = tmpNode.next;
            }else tmpNode.next=null;

            head = head.next;
        }

        return node;
    }


}
