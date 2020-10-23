package com.tangh.alglibrary.offer;

import java.util.Stack;

public class CQueue {

    Stack<Integer> stack = new Stack();
    Stack<Integer> stack2 = new Stack();

    public CQueue() {
        stack.clear();
        stack2.clear();
    }

    public void appendTail(int value) {
        stack.push(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()) {
            while (!stack.isEmpty()) {
                stack2.push(stack.pop());
            }
        }

        if (stack2 != null) {
            return stack2.pop();
        }

        return -1;
    }

}
