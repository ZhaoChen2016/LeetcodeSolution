package 递归与回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * creat by zhaochen on 2018/6/10 15:18
 */
public class Solution131 {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> partition(String s) {
        if (s == null){
            return res;
        }
        partitionHelper(s,0,new ArrayList<>());
        return res;

    }

    public void partitionHelper(String s,int index,List<String> list){
        if (index >= s.length()){
            res.add(list);
            return;
        }
        for (int i = index+1; i <= s.length(); i++){
            String len = s.substring(index,i);
            if (isPalindrome(len)){
                List list1 = new ArrayList<>(list);
                list1.add(len);
                partitionHelper(s,i,list1);
            }

        }

    }
    public Boolean isPalindrome(String s){
        for (int i = 0; i <= s.length()/2; i++){
            if (s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new Solution131().partition("aab");
    }
}
