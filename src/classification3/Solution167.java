package classification3;

/**
 * creat by zhaochen on 2018/5/12 21:23
 */
public class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int i= 0;
        int j = numbers.length-1;
        while(i < j){
            if (numbers[i]+numbers[j] == target){
                int res[] = {i+1,j+1};
                return res;
            }
            else if (numbers[i]+numbers[j] > target){
                j--;
            }
            else
                i++;
        }
        return null;

    }
}
