package queue;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * creat by zhaochen on 2018/5/29 10:32
 * 使用bfs来遍历
 * 图论的思想
 */
public class Solution279 {
    public int numSquares(int n) {
        LinkedList<Pair<Integer,Integer>> pq = new LinkedList<>();
        boolean[] visited = new boolean[n+1];
        visited[n] = true;
        pq.add(new Pair<>(n,0));
        while (pq != null){
            Pair<Integer,Integer> pair = pq.removeFirst();
            int value = pair.getKey();
            int step = pair.getValue();
            if (value == 0 )
                return step;
            visited[value] = true;
            for (int i = 1; value - i*i >=0; i++){
                int temp = value - i*i;
                if (!visited[temp]){
                    if (temp == 0)
                        return step+1;
                    visited[temp] = true;
                    pq.addLast(new Pair<>(temp,step+1));
                }
            }
        }
        throw new IllegalStateException("No Solution.");
    }
}
