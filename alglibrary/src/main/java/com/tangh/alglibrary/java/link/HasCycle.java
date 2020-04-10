package com.tangh.alglibrary.java.link;

import java.util.HashMap;

/**
 * 141. 环形链表
 * <p>
 * <p>
 * 给定一个链表，判断链表中是否有环。
 * <p>
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * 输入：head = [1,2], pos = 0
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第一个节点。
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * 输入：head = [1], pos = -1
 * 输出：false
 * 解释：链表中没有环。
 * <p>
 * 进阶：
 * <p>
 * 你能用 O(1)（即，常量）内存解决此问题吗？
 */
public class HasCycle {

    public static void main(String[] args) {

    }

    public static boolean hasCycle(ListNode head) {
        HashMap<Integer, Object> hashMap = new HashMap<>();

        while (head != null) {
            if (hashMap.containsKey(head.val)) {
                return true;
            } else hashMap.put(head.val, null);

            head = head.next;
        }
        return false;
    }

    public static boolean hasCycle2(ListNode head) {

        if(head==null||head.next==null) return false;

        ListNode preNode = head;
        ListNode currNode = head.next;


        while (preNode != null && currNode != null&&currNode.next!=null) {
            if(preNode==currNode) return true;

            preNode = preNode.next;
            currNode = currNode.next.next;
        }
        return false;
    }
}
