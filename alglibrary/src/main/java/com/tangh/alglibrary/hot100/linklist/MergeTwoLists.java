package com.tangh.alglibrary.hot100.linklist;

/**
 * 21. 合并两个有序链表
 * 难度
 * 简单
 * <p>
 * 1670
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 * 示例 2：
 * <p>
 * 输入：l1 = [], l2 = []
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：l1 = [], l2 = [0]
 * 输出：[0]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 两个链表的节点数目范围是 [0, 50]
 * -100 <= Node.val <= 100
 * l1 和 l2 均按 非递减顺序 排列
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode preNode = new ListNode(0);
        ListNode head = preNode;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                head.next = l2;
                break;
            }

            if (l2 == null) {
                head.next = l1;
                break;
            }

            if (l1.val <= l2.val) {
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }

            head = head.next;

        }

        return preNode.next;

    }

    public static void main(String[] args) {

    }
}
