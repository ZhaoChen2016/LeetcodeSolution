package classification3;

/**
 * creat by zhaochen on 2018/5/12 21:33
 */
public class Solution125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replace(" ","");
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length-1;
        while (i <= j){
            while (i<=j&&!Character.isLetterOrDigit(chars[i]))
                i++;//while循环嵌套的情况 要在内部的while循环以及if中加上判断语句 因为这时外部的while循环不起作用
            while (i<=j&&!Character.isLetterOrDigit(chars[j]))
                j--;
            if (chars[i] != chars[j])
                return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }

}

