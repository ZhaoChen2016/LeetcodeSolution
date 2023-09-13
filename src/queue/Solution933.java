package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Solution933 {
    class RecentCounter {
        private Queue<Integer> times;
        private int window;
        public RecentCounter() {
            times = new LinkedList<>();
            window = 3000;
        }

        public int ping(int t) {
            times.offer(t);
            while (times.peek() + window < t){
                times.poll();
            }
            return times.size();
        }
    }
}
