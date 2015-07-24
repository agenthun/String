package com.agenthun.string;

/**
 * Created by Agent Henry on 2015/7/24.
 */
public class Compare {
    public static void compare(String s1, String s2) {
        byte[] b1 = s1.getBytes();
        byte[] b2 = s2.getBytes();
        int[] bCount = new int[256];
        for (int i = 0; i < bCount.length; i++) {
            bCount[i] = 0;
        }
        for (int i = 0; i < b1.length; i++) {
            bCount[b1[i] - '0']++;
        }
        for (int i = 0; i < b2.length; i++) {
            bCount[b2[i] - '0']--;
        }
        for (int i = 0; i < bCount.length; i++) {
            if (bCount[i] != 0) {
                System.out.println("not equal");
                return;
            }
        }
        System.out.println("equal");
    }

    public static void main(String[] args) {
        String s1 = "aaaabbc";
        String s2 = "abcbaaa";
        compare(s1, s2);

        s1 = "aaaabbc";
        s2 = "abcbaab";
        compare(s1, s2);
    }
}
