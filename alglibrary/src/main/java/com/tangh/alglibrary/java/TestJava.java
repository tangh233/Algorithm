package com.tangh.alglibrary.java;

import android.util.LruCache;
import android.util.SparseArray;

import com.alibaba.fastjson.JSON;

import org.json.JSONObject;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

public class TestJava {
    public static void main(String[] args) {

        String 你好="hello---";
        System.out.println(你好);


//        List<Integer> list=new ArrayList<>();
//        List<String> objs=new ArrayList<>();
//
//
//
//        System.out.println(list.getClass()==objs.getClass());


//        TreeMap treeMap = new TreeMap();
//        treeMap.put("1", "2");

//        SparseArray<String> sparseArray=new SparseArray<>();
//        sparseArray.append(1,"11111");
//        sparseArray.append(2,"2222222");


//        System.out.println(JSON.toJSON(treeMap));
    }

    public static ListNode reverseList(ListNode head) {


        ListNode pre = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode node = curr.next;
            curr.next = pre;

            pre = curr;
            curr = node;
        }
        return pre;

    }

    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    /**
     * 26. 删除排序数组中的重复项
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int i = 0;//有效指针

        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {//有效
                i++;
                nums[i] = nums[j];
            }
        }

        return i;
    }

    public static ListNode createListNode(ListNode l1) {
//        for (int i = 0; i < 10; i++) {
//            ListNode n = new ListNode(i);
//            l1.next = n;
//        }

        l1.next = new ListNode(100);

        createListNode(l1.next);
        return l1;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

    public void reverseString(char[] s) {
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length; i++) stack.push(s[i]);
//        for (int i = 0; i < s.length; i++) s[i]=stack.pop();


        for (int i = 0; i < s.length / 2; i++) {
            char c = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = c;
        }

    }
}
