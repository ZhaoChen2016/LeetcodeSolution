package 二叉树;

import java.util.Map;
import java.util.TreeMap;

public class Solution729 {
    class MyCalendar {
        private TreeMap<Integer, Integer> map;
        public MyCalendar() {
            map = new TreeMap();
        }

        public boolean book(int start, int end) {
            Integer upper = map.ceilingKey(start);
            if (upper != null && upper < end){
                return false;
            }
            Map.Entry<Integer, Integer> lower = map.floorEntry(start);
            if (lower != null && lower.getValue() > start){
                return false;
            }
            map.put(start, end);
            return true;
        }
    }
}
