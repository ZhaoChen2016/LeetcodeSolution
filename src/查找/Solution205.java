package 查找;

import java.util.HashMap;
import java.util.Map;

/**
 * creat by zhaochen on 2018/5/16 20:31
 */
public class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character,Integer> maps = new HashMap<>();
        Map<Character,Integer> mapt = new HashMap<>();

        for (int i = 0;i < s.length(); i++){
            if (maps.containsKey(s.charAt(i)) && mapt.containsKey(t.charAt(i))){
                if (maps.get(s.charAt(i)) != mapt.get(t.charAt(i)))
                    return false;

            }else if (!maps.containsKey(s.charAt(i)) && !mapt.containsKey(t.charAt(i))){
                maps.put(s.charAt(i),i);
                mapt.put(t.charAt(i),i);
            }else
                return false;


        }

        return true;
    }

    public boolean isIsomorphic2(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character,Integer> maps = new HashMap<>();
        Map<Character,Integer> mapt = new HashMap<>();

        for (int i = 0;i < s.length(); i++){
            if (maps.put(s.charAt(i),i) != mapt.put(t.charAt(i),i))
                return false;
        }

        return true;
    }
}
