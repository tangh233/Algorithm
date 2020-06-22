package com.tangh.alglibrary.java.string;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * 387. 字符串中的第一个唯一字符
 *
 *  给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * 示例：
 * s = "leetcode"
 * 返回 0
 *
 * s = "loveleetcode"
 * 返回 2
 *
 * 提示：你可以假定该字符串只包含小写字母。
 */
public class FirstUniqChar {
    public static void main(String[] args) {
       new FirstUniqChar().firstUniqChar("leetcode");

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public int firstUniqChar2(String s) {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i),hashMap.getOrDefault(s.charAt(i),0)+1);
        }

        for (int i = 0; i < s.length(); i++) {
            if(hashMap.get(s.charAt(i))==1) return i;
        }
        return -1;
    }


    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> linkedHashMap=new LinkedHashMap<>();

        for (int i=0;i<s.length();i++){
          if(linkedHashMap.containsKey(s.charAt(i))) {
             int n= linkedHashMap.get(s.charAt(i));
             linkedHashMap.put(s.charAt(i),n+1);
          }else linkedHashMap.put(s.charAt(i),1);
        }

        Iterator<Character> iterator=linkedHashMap.keySet().iterator();
        while (iterator.hasNext()){
            char key=iterator.next();
            int value=linkedHashMap.get(key);
            if(value==1) return s.indexOf(key);
        }
        return -1;
    }
}
