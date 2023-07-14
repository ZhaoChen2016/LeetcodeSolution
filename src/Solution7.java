/**
 * creat by zhaochen on 2018/8/29 18:30
 */
public class Solution7 {
    public int reverse(int x) {
        long rev= 0;
        while( x != 0){
            rev= rev*10 + x % 10;
            x= x/10;
            if( rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
        }
        return (int) rev;
    }
}
