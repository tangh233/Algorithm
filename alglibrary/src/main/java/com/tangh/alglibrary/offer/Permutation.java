package com.tangh.alglibrary.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

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


    ArrayList<String> list =new ArrayList<>();

    public String[] permutation(String s) {
        char[] array = s.toCharArray();
        dfs(array, 0);

        return list.toArray(new String[list.size()]);
    }

    private void dfs(char[] array, int index) {
        if (index >= array.length) {
            String s = String.valueOf(array);
            list.add(s);
            System.out.println(s);
            return;
        }

        HashSet<Character> hashSet =new HashSet<>();

        for (int i = index; i < array.length; i++) {
            if(hashSet.contains(array[i])) continue;
            hashSet.add(array[i]);

            swap(array, index, i);
            dfs(array, index + 1);
            swap(array, index, i);
        }
    }

    private void swap(char[] array, int index, int i) {
        char tmp = array[index];
        array[index] = array[i];
        array[i] = tmp;
    }


    public static void main(String[] args) {
        new Permutation().permutation("122");
    }
}
