package com.hupu.javalib;

public class Test {
    public static void main(String[] args) {
        int ss = new Test().climbStairs(4);
        System.out.println(ss);
    }

    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
