package com.tangh.alglibrary.offer;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> sortStack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack<>();
        sortStack = new Stack<>();
    }

    public void push(int x) {

        if (sortStack.isEmpty()) {
            sortStack.push(x);
        } else {
            int minVal = sortStack.peek();
            if (x < minVal) {
                sortStack.push(x);
            } else {
                sortStack.push(minVal);
            }
        }
        stack.push(x);
    }

    public void pop() {
        stack.pop();
        sortStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return sortStack.peek();
    }

    public static void main(String[] args) {


    }
}
