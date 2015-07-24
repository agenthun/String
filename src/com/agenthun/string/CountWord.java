package com.agenthun.string;

/**
 * Created by Agent Henry on 2015/7/24.
 */
public class CountWord {
    public static int countWord(String s) {
        int word = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') word = 0;
            else if (word == 0) {
                word = 1;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "i am hun";
        System.out.println(str);
        System.out.println("count word = " + countWord(str));
    }
}
