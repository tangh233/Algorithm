package com.tangh.alglibrary.java.string;

/**
 * 14. 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * 所有输入只包含小写字母 a-z 。
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        new LongestCommonPrefix().longestCommonPrefix(new String[]{"c","c"});
    }


    public String longestCommonPrefix(String[] strs) {

        if(strs.length==0) return "";

        if(strs[0].length()==0) return "";

        for (int i =0; i < strs[0].length(); i++) {
            String commonPre = strs[0].substring(0, i+1);

            if(!compare(strs, commonPre))
                return strs[0].substring(0, i);

            if(i==strs[0].length()-1){
                return strs[0].substring(0,i+1);
            }
        }


        return "";
    }


    public boolean compare(String[] strs, String commonPre) {
        for (int i = 0; i < strs.length; i++) {
            if (!strs[i].startsWith(commonPre)) {
                return false;
            }
        }

        return true;
    }
}
