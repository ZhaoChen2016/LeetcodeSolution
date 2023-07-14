package DP;

import java.util.*;

/**
 * creat by zhaochen on 2018/6/19 19:44
 */
public class Solution120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i = triangle.size() - 2; i >= 0; i--) {//从倒数第二层开始算的
            for (int j = 0; j <= i; j++) {
                triangle.get(i).set(j, triangle.get(i).get(j) + Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1)));
            }
        }
        return triangle.get(0).get(0);
    }

    public static void main(String[] args) {
        List<List<Integer>> t = new ArrayList<>();
        Integer[] array1 = {4,1,8,3};
        Integer[] array2 = {6,5,7};
        Integer[] array3 = {3,4};
        Integer[] array4 = {2};
        t.add(0,new ArrayList<>(Arrays.asList(array1)));
        t.add(0,new ArrayList<>(Arrays.asList(array2)));
        t.add(0,new ArrayList<>(Arrays.asList(array3)));
        t.add(0,new ArrayList<>(Arrays.asList(array4)));
        new Solution120().minimumTotal(t);
    }
}
