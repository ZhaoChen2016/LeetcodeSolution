package 查找;

import java.util.HashSet;
import java.util.Set;

/**
 * creat by zhaochen on 2018/5/16 17:35
 */
public class Solution202V2 {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n!=1 && !set.contains(n)){
            set.add(n);
            n = getNext(n);
        }
        return n==1;

    }

    public int getNext(int n){
        int sum = 0;
        while (n>0){
            int d = n%10;
            n = n/10;
            sum += d*d;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 7;
        new Solution202V2().isHappy(n);
    }
}
