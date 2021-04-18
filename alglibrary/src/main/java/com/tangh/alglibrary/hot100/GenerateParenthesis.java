package com.tangh.alglibrary.hot100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * 22. 括号生成
 * 难度
 * 中等
 * <p>
 * 1733
 * <p>
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 * 示例 2：
 * <p>
 * 输入：n = 1
 * 输出：["()"]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= n <= 8
 */
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();

        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + "()";
        }




        return list;
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
            } else {
                stack.push(s.charAt(i) + "");
            }

        }

        return stack.isEmpty();
    }


    public static void main(String[] args) {

    }
}
