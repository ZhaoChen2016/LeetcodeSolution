package 查找;

import java.util.HashMap;
import java.util.Map;

/**
 * creat by zhaochen on 2018/5/18 13:17
 */
public class Solution447 {
    public int numberOfBoomerangs(int[][] points) {
        int record = 0;
        Map<Integer,Integer> maps = new HashMap<>();
        for (int i = 0; i < points.length;i++){
            for (int j = 0; j < points.length;j++){
                if (i == j)
                    continue;
                int dis = distance(points[i],points[j]);
                maps.put(dis,maps.getOrDefault(dis,0)+1);
            }

            for (int dis :maps.keySet()){
                int num  =maps.get(dis);
                record += num * (num -1);
            }
            maps.clear();
            }

        return record;
        }


    public int distance(int[] pa,int[] pb){
        return (pa[0]-pb[0])*(pa[0]-pb[0])+(pa[1]-pb[1])*(pa[1]-pb[1]);
    }
}
