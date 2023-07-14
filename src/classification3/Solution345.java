package classification3;

import javax.xml.stream.events.Characters;

/**
 * creat by zhaochen on 2018/5/12 22:05
 */
public class Solution345 {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length()-1;
        char[] chars = s.toCharArray();
        String vowels = "aeiouAEIOU";
        while (i <= j){
            while (i <= j && !vowels.contains(String.valueOf(chars[i])))
                i++;
            while (j >= i && vowels.contains(String.valueOf(chars[j])))
                j--;
            if (i <= j)
                swap(chars,i++,j--);
        }
        StringBuilder stringBuilder= new StringBuilder();
        for (char c:chars){
            stringBuilder.append(c);
        }

        return stringBuilder.toString();

    }

    public void swap(char [] nums,int i,int j){
        char temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
