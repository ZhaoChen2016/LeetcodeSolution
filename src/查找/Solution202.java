package 查找;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * creat by zhaochen on 2018/5/16 17:35
 */
public class Solution202 {
    public boolean isHappy(int n) {
        if (n <= 0)
            return false;
        int res = n;
        while (res != 1){
            if (res / 10 ==0){
                if (res !=1 && res != 7)
                    return false;
            }
            n = res;
            res = 0;
            while (n != 0){
                res += Math.pow(n % 10,2);
                n = n / 10;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int n = 7;
        new Solution202().isHappy(n);
    }
}
