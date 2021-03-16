package com.tangh.alglibrary.offer;

import java.util.ArrayList;

/**
 * 剑指 Offer 38. 字符串的排列
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 * <p>
 * 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
 * 示例:
 * <p>
 * 输入：s = "abc"
 * 输出：["abc","acb","bac","bca","cab","cba"]
 * <p>
 * 限制：
 * <p>
 * 1 <= s 的长度 <= 8
 */
public class Permutation {
    char[] tmp;
    ArrayList result = new ArrayList();

    public String[] permutation(String s) {
        char[] chars = s.toCharArray();
        tmp = new char[chars.length];

        dfs(chars, 0);
    }

    private void dfs(char[] chars, int i) {
        if (i >= chars.length) return;

        swap(chars, i, 0);

        for (int j = 0; j < chars.length; j++) {
            tmp[j] = chars[j];

        }

        dfs(chars, i + 1);
    }

    private void swap(char[] chars, int i, int j) {
        if (i == j) return;

        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }


    public static void main(String[] args) {

    }
}
