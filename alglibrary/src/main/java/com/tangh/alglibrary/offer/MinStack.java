package com.tangh.alglibrary.offer;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class MinStack {

    Stack<Integer> stack;
    TreeMap<Integer, Integer> treeMap;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack();
        treeMap = new TreeMap<>();
    }

    public void push(int x) {
        treeMap.put(x, treeMap.getOrDefault(x, 0) + 1);
        stack.push(x);
    }

    public void pop() {
        int val = stack.pop();
        int count = treeMap.getOrDefault(val, 0) - 1;
        if (count <= 0) {
            treeMap.remove(val);
        } else {
            treeMap.put(val, count);
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return treeMap.firstKey();
    }

    public static void main(String[] args) {


    }
}
