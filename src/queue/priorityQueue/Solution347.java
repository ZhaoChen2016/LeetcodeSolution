package queue.priorityQueue;

import javafx.util.Pair;

import java.util.*;

/**
 * creat by zhaochen on 2018/5/28 19:24
 */
public class Solution347 {
    private class myComparator implements Comparator<Map.Entry<Integer,Integer>>{

        @Override
        public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
            if (o1.getValue() != o2.getValue())
                return o2.getValue() - o1.getValue();
            else
                return o2.getKey() - o1.getKey();


        }
    }
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> maps = new HashMap<>();
        for (int i : nums){
            maps.put(i,maps.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(new myComparator());
        pq.addAll(maps.entrySet());
        List<Integer> lists = new ArrayList<Integer>();
        for(int i = 0; i < k; i++){
            lists.add(pq.poll().getKey());
        }
        return lists;
    }

    private static void printList(List<Integer> nums){
        for(Integer num: nums)
            System.out.print(num + " ");
        System.out.println();
    }

    public List<Integer> topKFrequent2(int[] nums, int k) {

        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        List<Integer> res = new ArrayList<>();

        for (int pos = bucket.length - 1; pos >= 0 && res.size() < k; pos--) {
            if (bucket[pos] != null) {
                res.addAll(bucket[pos]);
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        printList((new Solution347()).topKFrequent(nums, k));
    }
}
