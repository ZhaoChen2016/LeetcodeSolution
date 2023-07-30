package 查找;

import java.util.HashMap;
import java.util.Map;
//什么叫字典序？
public class Solution953 {
    public static boolean isAlienSorted(String[] words, String order) {
        int[] orderArr = new int[order.length()];
        for (int i = 0; i < order.length(); i++) {
            orderArr[order.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < words.length-1 ; i++) {
            if (!isSorted(words[i], words[i+1], orderArr)) {
                return false;
            }
        }
        return true;
    }

    public static Boolean isSorted(String word1, String word2, int[] order){
        int i = 0;
        for (; i < word1.length() && i < word2.length(); i++) {
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);
            if (order[ch1 - 'a'] > order[ch2 - 'a']) {
                return false;
            }
            if (order[ch1 - 'a'] < order[ch2 - 'a']) {
                return true;
            }
        }
        return i == word1.length();
    }

    public static void main(String[] args) {
        String[] word = {"hello", "hello"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(isAlienSorted(word, order));
    }
}
