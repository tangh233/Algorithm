package com.tangh.alglibrary.hot100.doublepoint;

/**
 * 5. 最长回文子串
 * 难度
 * 中等
 * <p>
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * 示例 2：
 * <p>
 * 输入：s = "cbbd"
 * 输出："bb"
 * 示例 3：
 * <p>
 * 输入：s = "a"
 * 输出："a"
 * 示例 4：
 * <p>
 * 输入：s = "ac"
 * 输出："a"
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length <= 1000
 * s 仅由数字和英文字母（大写和/或小写）组成
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        String s = new LongestPalindrome().longestPalindrome("ccc");
        System.out.println(s);

    }

    public String longestPalindrome(String s) {
        if (s == null) return null;
        if (s.length() <= 1) return s;

        String subStr;
        String maxStr = s.charAt(0) + "";

        for (int i = 1; i < s.length(); i++) {

            boolean isSame = s.charAt(i) == s.charAt(i - 1);

            if (isSame) {
                subStr = s.charAt(i) + "" + s.charAt(i);
                String sub = getMaxString(i - 2, i + 1, s, subStr);


                subStr = s.charAt(i) + "";
                String sub2 = getMaxString(i - 1, i + 1, s, subStr);

                subStr = sub.length() >= sub2.length() ? sub : sub2;

            } else {
                subStr = s.charAt(i) + "";
                subStr = getMaxString(i - 1, i + 1, s, subStr);
            }


            if (subStr.length() > maxStr.length()) {
                maxStr = subStr;
            }
        }

        return maxStr;
    }

    private String getMaxString(int left, int right, String s, String subStr) {

        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                subStr = s.charAt(left) + subStr + s.charAt(right);
                left--;
                right++;
            } else {
                break;
            }
        }

        return subStr;
    }


//    public String longestPalindrome(String s) {
//        if (s.length() == 0) return s;
//        if (s.length() == 1) return s;
//
//        return longestPalindrome(s, s.length());
//    }

    public String longestPalindrome(String s, int len) {

        String sb = null;
        for (int i = 0; i <= s.length() - len; i++) {
            sb = s.substring(i, len + i);

            if (isPalindrome(sb)) {
                return sb;
            }
        }
        return longestPalindrome(s, len - 1);
    }

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        return s.equals(sb.toString());
    }
}
