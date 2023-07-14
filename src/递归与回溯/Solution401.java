package 递归与回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * creat by zhaochen on 2018/6/11 11:16
 */
public class Solution401 {
    final int[] watch = {1,2,4,8,1,2,4,8,16,32};
    List<String> list = new ArrayList<String>();
    public List<String> readBinaryWatch(int num) {
        if(num<0){
           return list;
        }

        read_recursion(num, 0,  0 ,0);
        return list;
    }

    private void read_recursion(int num, int start, int hour, int minute){
        if(num == 0 && hour<12 && minute<60) {
            if(minute<10){
                list.add(hour+":0"+minute);
            }
            else{
                list.add(hour+":"+minute);
            }
            return;
        }
        if (num<0){
            return;
        }
        if (hour>12 || minute>60){
            return;
        }
        for(int i=start; i<watch.length; i++){
            if(i<4){
                read_recursion(num-1, i+1, hour+watch[i], minute);
            }
            else{
                read_recursion(num-1, i+1, hour, minute+watch[i]);
            }
            }
        }
    }





