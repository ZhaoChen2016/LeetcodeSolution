package queue.priorityQueue;

import java.util.*;

public class Solution373 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> nums1[o1[0]] + nums2[o1[1]] - nums1[o2[0]] - nums2[o2[1]]);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < Math.min(k, nums1.length); i++) {
            queue.offer(new int[]{i, 0});
        }
        while (k > 0 && !queue.isEmpty()){
            int[] arr = queue.poll();
            list.add(Arrays.asList(nums1[arr[0]], nums2[arr[1]]));
            if (arr[1] < nums2.length - 1){
                queue.offer(new int[]{arr[0], arr[1] + 1});
            }
            k--;
        }
        return list;
    }
}
