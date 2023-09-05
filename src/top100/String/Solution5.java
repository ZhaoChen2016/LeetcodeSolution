package top100.String;

public class Solution5 {
    public static String longestPalindrome(String s) {
        String longestString = "";
        for (int i = 0; i < s.length(); i++) {
            String count1 = countPalindrom(s, i, i);
            longestString = longestString.length() > count1.length() ? longestString : count1;
            String count2 = countPalindrom(s, i, i + 1);
            longestString = longestString.length() > count2.length() ? longestString : count2;
        }
        return longestString;
    }

    public static String countPalindrom(String s, int start, int end){
        if (start >= 0 && end < s.length() && s.charAt(start) != s.charAt(end))
            return "";
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }
        return s.substring(++start, end);
    }

    public static void main(String[] args) {
        longestPalindrome("babad");
    }
}
