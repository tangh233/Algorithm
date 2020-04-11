package com.tangh.alglibrary.java.link;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * 234. 回文链表
 * <p>
 * 请判断一个链表是否为回文链表。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 * <p>
 * 输入: 1->2->2->1
 * 输出: true
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 */
public class IsPalindrome {

    public static void main(String[] args) {
        ListNode listNode=new ListNode(-129);
        listNode.next=new ListNode(-129);
        isPalindrome2(listNode);
    }


    /**
     * 垃圾解法
     *
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        Stack<Integer> stack = new Stack<>();
        String vals = "";
        while (head != null) {
            vals = vals + head.val;
            stack.push(head.val);
            head = head.next;
        }
        if (stack.size() <= 1) return true;

        String newVals = "";
        while (!stack.isEmpty()) {
            newVals = newVals + stack.pop();
        }

        return newVals.equals(vals);
    }


    /**
     * @param head
     * @return
     */
    public static boolean isPalindrome2(ListNode head) {
        List<Integer> list=new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        for (int i = 0; i < list.size()/2; i++) {
            int j=list.size()-1-i;

            int a=list.get(i);
            int b=list.get(j);
            if(a!=b) return false;
        }

        return true;
    }

    /**
     * @param head
     * @return
     */
    public static boolean isPalindrome3(ListNode head) {



        return true;
    }
}
