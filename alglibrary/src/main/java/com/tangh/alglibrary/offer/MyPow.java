package com.tangh.alglibrary.offer;

public class MyPow {

    public double myPow(double x, int n) {
        if (n < 0) {
            return 1 / helper(x, n * -1);
        } else {
            return helper(x, n);
        }
    }

    public double helper(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;

        int flag = n & 1;
        double res = helper(x, n / 2);
        if (flag == 1) {
            return res * res * x;
        } else {
            return res * res;
        }
    }

//    public double myPow(double x, int n) {
//        if (n == 0) return 1;
//
//        double res = 1;
//        if (n > 0) {
//            for (int i = 1; i <= n; i++) {
//                res *= x;
//            }
//            return res;
//        }
//
//        if (n < 0) {
//            n = n * -1;
//            for (int i = 1; i <= n; i++) {
//                res *= x;
//            }
//
//            return 1 / res;
//        }
//
//        return 0;
//    }

    public static void main(String[] args) {
        double v = new MyPow().myPow(0.00001
                , 2147483647);
        System.out.println(v);
    }
}
