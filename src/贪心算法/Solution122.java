package 贪心算法;

/**
 * creat by zhaochen on 2018/8/29 16:28
 */
public class Solution122 {
    public int maxProfit(int[] prices) {
        int profile = 0;
        for (int i = 1;i < prices.length; i++){
            if (prices[i]-prices[i-1] < 0)
                continue;
            profile += prices[i]-prices[i-1];//相当于在每个涨价的时间都获得了利润 在降价时抛出
        }
        return profile;
    }
}
