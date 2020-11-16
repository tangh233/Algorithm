package com.tangh.alglibrary.offer;

public class HammingWeight {
    public static void main(String[] args) {
        System.out.println(2 & 2);
    }

    public int hammingWeight(int n) {

        int count = 0;
        int flag = 1;
        while (flag < n) {
            int i = flag & n;
//            if()
        }


        return count;
    }

//    public int hammingWeight(int n) {
//
//        int count = 0;
//        while (n != 0) {
//            int i = n & 1;
//            if (i == 1) {
//                count++;
//            }
//
//            n = n >> 1;
//        }
//        return count;
//    }
}
