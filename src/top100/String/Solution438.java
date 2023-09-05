package top100.String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        int[] count = new int[26];
        List<Integer> list = new ArrayList<>();
        if (s.length() < p.length())
            return list;
        for (int i = 0; i < p.length(); i++) {
            count[p.charAt(i) - 'a']++;
            count[s.charAt(i) - 'a']--;
        }
        
        if (isZero(count))
            list.add(0);

        for (int i = p.length(); i < s.length(); i++) {
            count[s.charAt(i) - 'a']--;
            count[s.charAt(i - p.length()) - 'a']++;
            if (isZero(count))
                list.add(i - p.length() + 1);
        }
        return list;
    }
    
    public boolean isZero(int[] count){
        for (int c : count){
            if (c != 0)
                return false;
        }
        return true;
    }
}
