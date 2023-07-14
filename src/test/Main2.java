package test;

import java.util.*;

/**
 * creat by zhaochen on 2018/4/9 20:52
 */
public class Main2 {
        private static Map<Character, Character> pair = null;

        public static String isMatch(String s)
        {
            Stack<Character> sc = new Stack<Character>();
            for (int i = 0; i < s.length(); i++)
            {
                Character ch = s.charAt(i);
                if (pair.containsValue(ch))
                {
                    sc.push(ch);
                } else if (pair.containsKey(ch))
                {
                    if (sc.empty())
                    {
                        return "No";
                    }

                    if (sc.peek() == pair.get(ch))
                    {
                        sc.pop();
                    } else
                    {
                        return "No";
                    }
                }

            }

            return sc.empty() ? "" : "NO";
        }

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            Stack<String> arrayList = new Stack<>();
            if (sc.hasNext())
            {
                arrayList.push(sc.next());
            }
        }

    }

