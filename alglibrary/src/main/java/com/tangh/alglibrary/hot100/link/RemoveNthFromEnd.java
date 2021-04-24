package com.tangh.alglibrary.hot100.link;

import java.util.HashMap;
import java.util.Stack;

/**
 * 19. 删除链表的倒数第 N 个结点
 * 难度
 * 中等
 * <p>
 * 1322
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * <p>
 * 进阶：你能尝试使用一趟扫描实现吗？
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 * 示例 2：
 * <p>
 * 输入：head = [1], n = 1
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：head = [1,2], n = 1
 * 输出：[1]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 链表中结点的数目为 sz
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 */
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        if (head.next == null && n == 0) return head;
        if (head.next == null && n == 1) return null;

        ListNode listNode = head;
        int size = 0;
        while (listNode != null) {
            listNode = listNode.next;
            size++;
        }

        int index = size - n;
        if (index == 0) return head.next;

        listNode = head;
        ListNode preNode = head;
        while (listNode != null) {
            ListNode tmp = listNode.next;
            if (index == 0) {
                preNode.next = tmp;


                break;
            }

            preNode = listNode;
            listNode = tmp;
            index--;
        }

        return head;

    }

    public static void main(String[] args) {
        Stack<Object> objects = new Stack<>();
        objects.peek();

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        new RemoveNthFromEnd().removeNthFromEnd(listNode, 2);

    }

    public boolean isValid(String s) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(")", "(");
        hashMap.put("]", "[");
        hashMap.put("}", "{");

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String val = hashMap.get(s.charAt(i) + "");
            if (!stack.isEmpty() && stack.peek().equals(val)) {
                stack.pop();
            } else{
                stack.push(s.charAt(i) + "");
            }

        }

        return stack.isEmpty();
    }
}
