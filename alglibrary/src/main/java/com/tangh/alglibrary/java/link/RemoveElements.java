package com.tangh.alglibrary.java.link;

/**
 * 203. 移除链表元素
 * <p>
 * 删除链表中等于给定值 val 的所有节点。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
public class RemoveElements {
    public static void main(String[] args) {
        ListNode node=new ListNode(1);
        node.next=new ListNode(2);
        node.next.next=new ListNode(2);
        removeElements(node,2);
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;

        //哨兵节点
        ListNode preHeader =new ListNode(0);
        ListNode node=preHeader;

        while (head != null) {
            if (head.val != val) {
                node.next = head;
                node = node.next;
            }else node.next=null;

            head = head.next;
        }

        return preHeader.next;
    }
}
