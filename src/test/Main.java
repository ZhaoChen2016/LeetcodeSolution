package test;

import java.util.Scanner;

/**
 * creat by zhaochen on 2018/4/5 16:01
 */
public class Main {
    public static void main(String[] args) {
        String s = "abc";
        String n = new String("abc").intern();
        System.out.println(s == n);
    }
}
