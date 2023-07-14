package 滑动窗口;

/**
 * creat by zhaochen on 2018/5/13 19:33
 */
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int res = 0;
        int freq[] = new int[128];
        while (i < s.length()){
            if (j < s.length() && freq[s.charAt(j)]==0)
                freq[s.charAt(j++)]++;
            else
                freq[s.charAt(i++)]--;

            res = Math.max(res, j-i+1);
        }

        return res;
    }
}
