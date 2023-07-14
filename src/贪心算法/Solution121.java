package 贪心算法;

/**
 * creat by zhaochen on 2018/8/29 16:38
 */
public class Solution121 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int maxProfit = 0, minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > minPrice) maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            //找到这个时间点之前的最低价
            else minPrice = prices[i];
        }
        return maxProfit;
    }
}
