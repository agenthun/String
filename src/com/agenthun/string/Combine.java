package com.agenthun.string;

/**
 * Created by Agent Henry on 2015/7/24.
 */
public class Combine {
    public static void combine(char[] c) {
        if (c == null) return;
        int len = c.length;
        boolean[] used = new boolean[len];
        char[] cache = new char[len];
        int result = len;
        while (true) {
            int index = 0;
            while (used[index]) {
                used[index] = false;
                ++result;
                if (++index == len) return;
            }
            used[index] = true;
            cache[--result] = c[index];
            System.out.println(new String(cache).substring(result));
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        char[] c = s.toCharArray();
        combine(c);
    }
}
