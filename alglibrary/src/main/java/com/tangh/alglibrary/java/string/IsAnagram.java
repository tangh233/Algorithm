package com.tangh.alglibrary.java.string;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 242. 有效的字母异位词
 * <p>
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 * <p>
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 */
@RequiresApi(api = Build.VERSION_CODES.N)
public class IsAnagram {

    public static void main(String[] args) {
//        new IsAnagram().isAnagram("anagram", "nagaram");
        System.out.println("10".hashCode());
        System.out.println("2".hashCode());
    }

    public boolean isAnagram2(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);

        return Arrays.equals(ss, tt);
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            if (!hashMap.containsKey(t.charAt(i))) {
                return false;
            } else {
                int count = hashMap.get(t.charAt(i)) - 1;
                hashMap.put(t.charAt(i), count);
                if (count == 0) {
                    hashMap.remove(t.charAt(i));
                }
            }

        }
        boolean flag = hashMap.isEmpty();
        return flag;

    }
}
