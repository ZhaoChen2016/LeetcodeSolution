package 查找;

import java.util.HashMap;
import java.util.Map;

/**
 * creat by zhaochen on 2018/5/16 19:41
 */
public class Solution290 {
    public boolean wordPattern(String pattern, String str) {
        String[] strArray = str.split(" ");
        int paLen = pattern.length();
        if (paLen != strArray.length)
            return false;
        Map<Character,String> maps = new HashMap<>();
        for (int i = 0; i < paLen;i++){
            if (maps.containsKey(pattern.charAt(i))){
                if (!strArray[i].equals(maps.get(pattern.charAt(i))))
                    return false;
            }
            else{
                if (!maps.containsValue(strArray[i]))//key不相等但是value相等的情况
                    return false;
                else
                    maps.put(pattern.charAt(i),strArray[i]);
            }

        }

        return true;

    }

    public boolean wordPattern2(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;
        Map index = new HashMap();
        for (Integer i=0; i<words.length; ++i)
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))//两个重复出现的index是一样的
                return false;
        return true;
    }


    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat fish";
        new Solution290().wordPattern(pattern,str);
    }
}
