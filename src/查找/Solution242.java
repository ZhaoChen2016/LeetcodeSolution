package 查找;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * creat by zhaochen on 2018/5/16 17:10
 */
public class Solution242 {//变成数组之后排序
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> maps = new HashMap<>();
        for (int i = 0; i < s.length();i++){
            char c = s.charAt(i);
            if (maps.containsKey(c))
                maps.put(c,maps.get(c)+1);
            else
                maps.put(c,1);
        }
        for (int i = 0;i < t.length();i++){
            char c = t.charAt(i);
            if (maps.containsKey(c) && maps.get(c) > 0)
                maps.put(c,maps.get(c)-1);
            else
                return false;
        }

        for (int i:maps.values()){
            if (i!=0)
                return false;
        }

        return true;
    }

    public boolean isAnagram2(String s, String t) {
        Map<Character,Integer> maps = new HashMap<>();
        for (int i = 0; i < s.length();i++){
            char c = s.charAt(i);
            if (maps.containsKey(c))
                maps.put(c,maps.get(c)+1);
            else
                maps.put(c,1);
        }

        for (int i = 0; i < t.length();i++){
            char c = t.charAt(i);
            if (maps.containsKey(c))
                maps.put(c,maps.get(c)-1);
            else
                return false;
        }

        for (int i:maps.values()){
            if (i!=0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "na";
        String t = "an";
        new Solution242().isAnagram(s,t);
    }
}
