package DP;

/**
 * creat by zhaochen on 2018/6/21 17:33
 */
public class Solution91 {
    /*public int numDecodings(String s) {
        int n = s.length();
        if (n == 0) return 0;

        int[] memo = new int[n+1];
        memo[n]  = 1;
        memo[n-1] = s.charAt(n-1) != '0' ? 1 : 0;

        for (int i = n - 2; i >= 0; i--)
            if (s.charAt(i) == '0') continue;
            else memo[i] = (Integer.parseInt(s.substring(i,i+2))<=26) ? memo[i+1]+memo[i+2] : memo[i+1];

        return memo[0];
    }*/

    public int numDecodings(String s) {
        int n = s.length();
        int[] memo = new int[n];
        memo[0] = s.charAt(0) == '0'? 0 : 1;
        for (int i = 1; i < n; i++){
            if (s.charAt(i) > '0'){
                memo[i] += memo[i-1];
            }
            int doub = (s.charAt(i-1)-'0')*10+s.charAt(i)-'0';
            if (doub <= 26 && doub >= 10){
                memo[i] += (i-2 >= 0) ?memo[i-2]:1;
            }
        }

        return memo[n-1];
    }

    public static void main(String[] args) {
        new Solution91().numDecodings("10");
    }
}
