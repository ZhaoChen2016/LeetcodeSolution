package classification2;

/**
 * creat by zhaochen on 2018/5/11 10:38
 */
public class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        k = nums.length -k;
        int hi = nums.length-1;
        int index = sort(nums,0,hi,k);
        return nums[index];

    }

    public int sort(int[]nums,int lo,int hi,int k){
        if (lo > hi)
            return Integer.MAX_VALUE;
        int index = partition(nums,lo,hi);
        if (index < k)
            return sort(nums,index+1,hi,k);
        else if (index > k)
            return sort(nums,lo,index-1,k);
        else
            return index;


    }


    public int partition(int[] arr,int lo,int hi){//感觉也是指针对撞
        int e = arr[lo];
        int i = lo+1;
        int j = hi;
        while (true){
            while (i <= hi && arr[i] < e)
                i++;
            while (hi >=lo && arr[j] >e)
                j--;
            if (i >= j)
                break;
            swap(arr,i++,j--);
        }
        swap(arr,lo,j);
        return j;

    }

    public void swap(int [] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
