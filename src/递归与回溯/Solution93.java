package 递归与回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * creat by zhaochen on 2018/6/10 14:09
 */
public class Solution93 {
    List<String> res = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        if (s == null){
            return res;
        }
        IpReslover(s,0,"",0);
        return res;
    }

    public void IpReslover(String s,int index,String ip,int count){
        if (count > 4){
            return;
        }
        if (count == 4 && index == s.length()){
            res.add(ip);
        }
        for (int i = 1; i < 4; i++){
            if (index+i > s.length()) {break;}
            String len = s.substring(index,index+i);
            if ((len.startsWith("0") && len.length()>1) || (i == 3 && Integer.parseInt(len) >= 256 )){
                continue;}
            IpReslover(s,index+i,ip + len + (count == 3 ? "" : "."),count+1);
        }
    }

    public static void main(String[] args) {
        new Solution93().restoreIpAddresses("25525511135");
    }
}
