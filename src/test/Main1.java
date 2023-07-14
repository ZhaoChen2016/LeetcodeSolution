package test;

import java.util.Scanner;

/**
 * creat by zhaochen on 2018/4/9 19:52
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder s2 = new StringBuilder(s).reverse();
        int m = s1.length();
        int n = s2.length();
        int[][] mutrix = new int[m + 1][n + 1];

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(s1.charAt(i - 1) == s2.charAt(j - 1))
                    mutrix[i][j] = mutrix[i - 1][j - 1] + 1;
                else
                    mutrix[i][j] = Math.max(mutrix[i - 1][j], mutrix[i][j - 1]);
            }
        }
//        System.out.println(mutrix[m][n]);

        int numbers = (mutrix[m][n]+1)/2;
        int times = 1+m+(int)Math.pow(2,numbers)-1-1;

//        System.out.println(m - mutrix[m][n]);
        System.out.println(times);


    }
}
