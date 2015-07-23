package com.agenthun.string;

/**
 * Created by Agent Henry on 2015/7/23.
 */
public class ReverseWord {
    public static void swap(char[] cArr, int front, int end) {
        while (front < end) {
            char temp = cArr[end];
            cArr[end] = cArr[front];
            cArr[front] = temp;
            front++;
            end--;
        }
    }

    private String reverseWord(String s) {
        char[] cArr = s.toCharArray();
        swap(cArr, 0, cArr.length - 1);
        //对单词进行反转
        int begin = 0;
        for (int i = 1; i < cArr.length; i++) {
            if (cArr[i] == ' ') {
                swap(cArr, begin, i - 1);
                begin = i + 1;
            }
        }
        swap(cArr, begin, cArr.length - 1);
        return new String(cArr);
    }


    public static void main(String[] args) {
        String str = "how are you";
        System.out.println(str);
        System.out.println(new ReverseWord().reverseWord(str));
    }
}
