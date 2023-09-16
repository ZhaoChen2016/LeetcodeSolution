package queue.priorityQueue;

import java.util.PriorityQueue;

public class Solution703 {
    class KthLargest {
        private PriorityQueue<Integer> queue;
        private int size;

        public KthLargest(int k, int[] nums) {
            size = k;
            queue = new PriorityQueue<>();
            for (Integer i : nums){
                add(i);
            }
        }

        public int add(int val) {
            if (queue.size() < size){
                queue.offer(val);
            }else if (queue.peek() < val){
                queue.poll();
                queue.offer(val);
            }
            return queue.peek();
        }
    }
}
