package com.tangh.alglibrary.offer;

import java.util.HashMap;

public class NumWays {
    public int numWays(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;

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


//    public int numWays(int n) {
//        if (n == 1) return 1;
//        if (n == 2) return 2;
//        return numWays(n - 1) + numWays(n - 2);
//    }
}
