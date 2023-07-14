package 查找;

import sun.awt.datatransfer.DataTransferer;

import java.util.*;

/**
 * creat by zhaochen on 2018/5/16 21:07
 */
public class Solution451 {
    /*public String frequencySort(String s) {
        Map<Character,Integer> maps = new HashMap<>();
        for (int i = 0;i < s.length(); i++){
            char c = s.charAt(i);
            if (maps.containsKey(c))
                maps.put(c,maps.get(c)+1);
            else
                maps.put(c,1);
        }
        List<Map.Entry<Character,Integer>> list = new LinkedList<>(maps.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            //基于entry的值（Entry.getValue()），来排序链表
            @Override
            public int compare(Map.Entry<Character, Integer> o1,
                               Map.Entry<Character, Integer> o2) {

                return o2.getValue().compareTo(o1.getValue());
            }
        });
        String fin = "";
        for (Map.Entry<Character, Integer> m:list){
            int v = m.getValue();
            Character c = m.getKey();
            System.out.println("v "+v+"c "+c);
            for (int i = 0;i < v;i++)
                fin += c;
        }

        return fin;
    }*/

    public String frequencySort(String s) {
        Map<Character,Integer> maps = new HashMap<>();
        for (int i = 0;i < s.length(); i++){
            char c = s.charAt(i);
            if (maps.containsKey(c))
                maps.put(c,maps.get(c)+1);
            else
                maps.put(c,1);
        }

        List<Character> [] bucket = new List[s.length() + 1];
        for (char key : maps.keySet()) {
            int frequency = maps.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        StringBuilder sb = new StringBuilder();
        for (int pos = bucket.length - 1; pos >=0; pos--) {
            if (bucket[pos] != null) {
                for (char num : bucket[pos]) {
                    for (int i = 0; i < maps.get(num); i++) {
                        sb.append(num);
                    }
                }
            }
        }
        return sb.toString();
    }



    public static void main(String[] args) {
        new Solution451().frequencySort("tree");
    }
}
