package top100.String;

import java.util.*;

public class Solution49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());

    }

    public static void main(String[] args) {
        groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }
}
