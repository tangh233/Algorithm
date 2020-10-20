package com.tangh.alglibrary.offer;

import com.tangh.alglibrary.java.link.ListNode;

import java.util.List;
import java.util.Stack;

public class ReversePrint {
    public static void main(String[] args) {

    }

    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack();
        int count = 0;
        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        while (!stack.isEmpty()) {
            stack.pop();
        }

        return null;
    }

//    public int[] reversePrint(ListNode head) {
//        ListNode node = head;
//        int count = 0;
//        while (head != null) {
//            head = head.next;
//            count++;
//        }
//
//        int[] nums = new int[count];
//        while (node != null) {
//            nums[--count] = node.val;
//            node = node.next;
//        }
//
//        return nums;
//
//    }
}
