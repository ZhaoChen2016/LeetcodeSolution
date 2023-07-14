package top100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        Boolean[] arr = new Boolean[n+1];
        Arrays.fill(arr,false);
        for (int i : nums){
            arr[i] = true;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == false){
                list.add(i);
            }
        }
        return list;
    }
}
