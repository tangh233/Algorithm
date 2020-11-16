package com.tangh.alglibrary.offer;

public class CuttingRope {
    public static void main(String[] args) {

    }

    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];

        int res = 0;
        for (int i = 2; i < n; i++) {
            for (int j = 1; j < i; j++) {
                res = Math.max(res, Math.max(j * (i - j), j * dp[i - j]));
            }
            dp[i] = res;
        }

        return res;

    }

}
