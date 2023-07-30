package 查找;

import java.util.Arrays;
import java.util.List;

public class Solution539 {
    public int findMinDifference(List<String> timePoints) {
        Boolean[] arr = new Boolean[1440];
        Arrays.fill(arr, false);
        for (String point : timePoints){
            String[] points = point.split(":");
            int value = Integer.valueOf(points[0]) * 60 + Integer.valueOf(points[1]);
            if (arr[value] == true) {
                return 0;
            }
            arr[value] = true;
        }
        int first = -1;
        int last = -1;
        int pre = -1;
        int minDif = arr.length -1;
        for (int i = 0; i < arr.length; i++) {
            Boolean b = arr[i];
            if (!b) {
                continue;
            }
            if (pre == -1){
                first = i;
                pre = i;
            } else {
                last = Math.max(last, i);
                minDif = Math.min(minDif, i - pre);
                pre = i;
            }
        }

        return Math.min(first + 1440 - last , minDif);

    }
}
