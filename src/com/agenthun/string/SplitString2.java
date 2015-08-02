package com.agenthun.string;

/**
 * Created by Agent Henry on 2015/8/2.
 */
public class SplitString2 {
    public static void splitString2(String str, int bytes) {
        int loopCount;
        loopCount = (str.length() % bytes == 0) ? (str.length() / bytes) : (str.length() / bytes + 1);//截取量

        for (int i = 0; i < loopCount; i++) {
            if (i == loopCount - 1) {
                System.out.println(str.substring(i * bytes, str.length()));
            } else {
                System.out.println(str.substring(i * bytes, (i + 1) * bytes));
            }
        }
    }

    public static void main(String[] args) {
        String s1 = "我ABC";
        splitString2(s1, 4);
        System.out.println();

        String s2 = "我ABC汉DEF";
        splitString2(s2, 6);
    }
}
