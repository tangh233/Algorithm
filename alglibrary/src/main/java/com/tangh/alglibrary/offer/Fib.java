package com.tangh.alglibrary.offer;

import java.util.HashMap;

public class Fib {
    public static void main(String[] args) {
        new Fib().fib(45);
    }

    public int fib(int n) {
        int pre = 0;
        int pre2 = 1;
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            sum = pre + pre2;

            pre = pre2;
            pre2 = sum;
        }

        return sum;
    }

//    public int fib(int n) {
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        hashMap.put(0, 0);
//        hashMap.put(1, 1);
//        for (int i = 2; i <= n; i++) {
//            hashMap.put(i, hashMap.get(i - 1) + hashMap.get(i - 2));
//        }
//
//        return hashMap.get(n);
//    }
}
