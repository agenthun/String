package com.agenthun.string;

/**
 * Created by Agent Henry on 2015/7/24.
 */
public class RemoveDuplicate {
    public static String removeDuplicate(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '\0') continue;
            for (int j = i + 1; j < c.length; j++) {
                if (c[j] == '\0') continue;
                if (c[j] == c[i]) c[j] = '\0';
            }
        }

        int l = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] != '\0') c[l++] = c[i];
        }
        return new String(c, 0, l);
    }

    public static void main(String[] args) {
        String s = "abcaabcd";
        System.out.println(s);
        System.out.println(removeDuplicate(s));
    }
}
