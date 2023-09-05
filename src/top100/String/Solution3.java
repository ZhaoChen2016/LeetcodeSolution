package top100.String;

public class Solution3 {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int[] count = new int[256];
        count[s.charAt(0)]++;
        while (left <= right && right < s.length()){
            if (withoutRepeating(count)){
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
                count[s.charAt(right) - 'a']++;
            } else {
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return maxLength;
    }

    public static boolean withoutRepeating(int[] count){
        for (int i : count){
            if (i > 1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring("abcabcbb");
    }
}
