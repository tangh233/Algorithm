package com.tangh.alglibrary.hot100.linklist;

import com.tangh.alglibrary.hot100.ListNode;

import java.util.HashSet;

/**
 * 160. 相交链表
 * 难度
 * 简单
 * <p>
 * 1109
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 编写一个程序，找到两个单链表相交的起始节点。
 * <p>
 * 如下面的两个链表：
 * <p>
 * <p>
 * <p>
 * 在节点 c1 开始相交。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * 输入：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
 * 输出：Reference of the node with value = 8
 * 输入解释：相交节点的值为 8 （注意，如果两个链表相交则不能为 0）。从各自的表头开始算起，链表 A 为 [4,1,8,4,5]，链表 B 为 [5,0,1,8,4,5]。在 A 中，相交节点前有 2 个节点；在 B 中，相交节点前有 3 个节点。
 */
public class GetIntersectionNode {

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode tmpA = headA;
        ListNode tmpB = headB;
        int sizeA = 0;
        while (tmpA != null) {
            sizeA++;
            tmpA = tmpA.next;
        }

        int sizeB = 0;
        while (tmpB != null) {
            sizeB++;
            tmpB = tmpB.next;
        }

        if (sizeA > sizeB) {
            int size = sizeA - sizeB;
            for (int i = 0; i < size; i++) {
                headB = headB.next;
            }
        } else if (sizeA < sizeB) {
            int size = sizeB - sizeA;
            for (int i = 0; i < size; i++) {
                headA = headA.next;
            }
        }

        while (headA != null){
            if(headA == headB) return headA;

            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hashSet = new HashSet<>();
        while (headA != null) {
            hashSet.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (hashSet.contains(headB)) return headB;

            headB = headB.next;
        }

        return null;
    }
}
