package com.tangh.alglibrary.hot100.string;

import java.util.HashMap;

/**
 * 3. 无重复字符的最长子串
 * 难度
 * 中等
 *
 * <p>
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 示例 4:
 * <p>
 * 输入: s = ""
 * 输出: 0
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 <= s.length <= 5 * 104
 * s 由英文字母、数字、符号和空格组成
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "dvdf";
        int i = new LengthOfLongestSubstring().lengthOfLongestSubstring(s);
        System.out.println(i);
    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;


        HashMap<Character, Integer> hashMap = new HashMap<>();
        int tmp = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                int index = hashMap.get(s.charAt(i));
                result = Math.max(result, i - index);

                i = index + 1;//仙人指路
                hashMap.clear();
                hashMap.put(s.charAt(i),i);
                tmp = 1;
            } else {
                hashMap.put(s.charAt(i), i);
                tmp++;
            }
            result = Math.max(result, tmp);
        }

        return result;
    }

//    public int lengthOfLongestSubstring(String s) {
//        if (s == null || s.length() == 0) return 0;
//
//        return lengthOfLongestSubstring(s, s.length());
//    }

    public int lengthOfLongestSubstring(String s, int len) {
        if (len == 1) return 1;
        for (int i = 0; i < s.length() - len + 1; i++) {
//            String substring = s.substring(i, i + len);

            if (!hasSameChar(s, i, i + len)) {
                return len;
            }
        }
        return lengthOfLongestSubstring(s, len - 1);
    }

    public boolean hasSameChar(String s, int start, int end) {
        HashMap<Character, Integer> hashMap = new HashMap();

        for (int i = start; i < end; i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                return true;
            } else {
                hashMap.put(s.charAt(i), 1);
            }
        }

        return false;
    }
}
