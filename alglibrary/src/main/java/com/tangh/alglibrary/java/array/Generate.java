package com.tangh.alglibrary.java.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. 杨辉三角
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * <p>
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * <p>
 * 示例:
 * <p>
 * 输入: 5
 * 输出:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
public class Generate {
    public static void main(String[] args) {
        generate(5);
    }

    public static List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();

        List<List<Integer>> rowList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list = getNumList(list);
            rowList.add(list);
        }
        return rowList;

    }

    public static List<Integer> getNumList(List<Integer> preList) {
        List<Integer> list = new ArrayList<>();
        list.add(1);

        if (preList.size() == 0) return list;

        for (int i = 1; i < preList.size(); i++) {
            list.add(preList.get(i) + preList.get(i - 1));
        }
        list.add(1);
        return list;
    }
}
