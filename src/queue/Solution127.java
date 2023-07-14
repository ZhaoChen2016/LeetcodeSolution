package queue;

import javafx.util.Pair;

import java.util.*;

/**
 * creat by zhaochen on 2018/5/29 11:04
 */
public class Solution127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>(wordList);//使用set对list去重
        if (set.contains(beginWord))
            set.remove(beginWord);

        HashSet<String> inSet = new HashSet<>();
        inSet.add(beginWord);//这个相当于visit数组 标记访问过的 不会重复访问
        LinkedList<Pair<String,Integer>> list = new LinkedList<>();
        list.addLast(new Pair<>(beginWord,1));

        while (list.size()!=0){
            Pair<String,Integer> pair = list.removeFirst();//removeFirst 第一个元素 removeLast 最后一个元素这个就变成了深度优先的遍历
            String value = pair.getKey();
            int step = pair.getValue();
            for (int i = 0; i < value.length(); i++){
                char[] chars = value.toCharArray();
                for (char c = 'a'; c <='z'; c++){
                    chars[i] = c;
                    String replace = new String(chars);

                    if (set.contains(replace) && !inSet.contains(replace)){
                        if (replace.equals(endWord))
                            return step+1;
                        list.addLast(new Pair<>(replace,step+1));
                        inSet.add(replace);
                    }

                }
            }
        }
        return 0;



    }

    public int ladderLength2(String beginWord, String endWord, List<String> wordList) {
        Set<String> worddict = new HashSet<>(wordList);
        Queue<String> queue = new LinkedList<>();
        HashMap<String, Integer> map = new HashMap<>();//beginWord -> String, total length
        map.put(beginWord, 1);

        queue.offer(beginWord);
        while(!queue.isEmpty()) {
            String curWord = queue.poll();
            //change each char of curWord
            for(int i = 0; i < curWord.length(); i++) {
                char[] changeArray = curWord.toCharArray();
                for(char ch = 'a'; ch <= 'z'; ch++) {
                    changeArray[i] = ch;
                    String changeWord = new String(changeArray);
                    if(worddict.contains(changeWord) && !map.containsKey(changeWord)) {
                        if(changeWord.equals(endWord)){
                            return map.get(curWord) + 1;//total words = transform + 1
                        }
                        map.put(changeWord, map.get(curWord) + 1);
                        queue.offer(changeWord);
                    }

                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String[] list = {"hot","dot","dog","lot","log"};
        List<String> wordList = Arrays.asList(list);

        int i
        =new Solution127().ladderLength("hit",
                "cog",
                wordList);
        System.out.println(i);
    }
}
