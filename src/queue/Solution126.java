package queue;

import java.util.*;

/**
 * creat by zhaochen on 2018/5/29 20:16
 */
public class Solution126 {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> res = new LinkedList<>();
        Queue<String> q = new LinkedList<>();
        Queue<List<String>> list = new LinkedList<>();
        Queue<Integer> level = new LinkedList<>();
        Set<String> dic = new HashSet<>(wordList);

        q.add(beginWord);
        level.offer(1);
        List<String> l = new LinkedList<>();
        l.add(beginWord);
        list.offer(l);

        int endWordlev = Integer.MAX_VALUE;

        Map<String, Integer> nodeLevel = new HashMap<>();
        for(String n: dic){
            nodeLevel.put(n,Integer.MAX_VALUE );
        }
        nodeLevel.put(beginWord, 1);
        while(!q.isEmpty()){
            char[] word = q.poll().toCharArray();
            List<String> ladder = list.poll();
            int lev = level.poll();
            if(lev > endWordlev){
                return res;
            }
            for(int i = 0; i < beginWord.length(); i++){
                char temp = word[i];
                for(char c = 'a'; c <= 'z'; c++){
                    if(temp == c){
                        continue;
                    }
                    word[i] = c;
                    String mid = new String(word);
                    if(dic.contains(mid) && lev <= nodeLevel.get(mid)){
                        List<String> newList = new LinkedList<>(ladder);
                        newList.add(mid);
                        if(mid.equals(endWord)){

                            if(endWordlev == Integer.MAX_VALUE){
                                endWordlev = lev;
                            }
                            res.add(newList);
                        }else{
                            q.offer(mid);
                            list.offer(newList);
                            level.offer(lev + 1);
                            nodeLevel.put(mid, lev);

                        }
                    }
                }

                word[i] = temp;

            }

        }
        return res;
    }
}
