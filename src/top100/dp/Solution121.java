package top100.dp;

public class Solution121 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for (int i : prices) {
            maxProfit = (i - minPrice) > maxProfit ? (i - minPrice) : maxProfit;
            minPrice = (i < minPrice) ? i : minPrice;
        }
        if (maxProfit < 0) {
            return 0;
        }
        return maxProfit;
    }
}
