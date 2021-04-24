package com.tangh.alglibrary.hot100.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 17. 电话号码的字母组合
 * 难度
 * 中等
 * <p>
 * 1255
 * <p>
 * 收藏
 * <p>
 * 分享
 * 切换为英文
 * 接收动态
 * 反馈
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 * <p>
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：digits = "23"
 * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * 示例 2：
 * <p>
 * 输入：digits = ""
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：digits = "2"
 * 输出：["a","b","c"]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 <= digits.length <= 4
 * digits[i] 是范围 ['2', '9'] 的一个数字。
 */
public class LetterCombinations {

    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();

        if (digits == null) return null;
        if (digits.length() == 0) return list;

        HashMap<Character, String> hashMap = new HashMap<>();
        hashMap.put('2', "abc");
        hashMap.put('3', "def");
        hashMap.put('4', "ghi");
        hashMap.put('5', "jkl");
        hashMap.put('6', "mno");
        hashMap.put('7', "pqrs");
        hashMap.put('8', "tuv");
        hashMap.put('9', "wxyz");


        recursion(list, hashMap, digits, 0, new StringBuilder());


        return list;
    }

    private void recursion(List<String> list, HashMap<Character, String> hashMap, String digits, int i, StringBuilder sb) {
        if (i == digits.length()) {
            list.add(sb.toString());
        } else {
            String s = hashMap.get(digits.charAt(i));
            for (int j = 0; j < s.length(); j++) {
                sb.append(s.charAt(j));
                recursion(list, hashMap, digits, i + 1, sb);
                sb.deleteCharAt(i);
            }


        }
    }


    public static void main(String[] args) {
        List<String> list = new LetterCombinations().letterCombinations("23");
        System.out.println(list);
    }
}
