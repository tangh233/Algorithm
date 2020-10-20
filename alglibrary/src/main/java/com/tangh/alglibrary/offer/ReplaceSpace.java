package com.tangh.alglibrary.offer;

import java.util.Arrays;

public class ReplaceSpace {
    public static void main(String[] args) {
        String we_are_happy = new ReplaceSpace().replaceSpace("we are happy");
        System.out.println(we_are_happy);
    }

    public String replaceSpace(String s) {

        int count = 0;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                count++;
            }
        }

        char[] cs = new char[s.length() + count*3];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                cs[index++] = '%';
                cs[index++] = '2';
                cs[index++] = '0';
            } else {
                cs[index++] = c;
            }
        }

        return new String(cs);
    }

//    public String replaceSpace(String s) {
//        return s.replace(" ", "20%");
//    }
}
