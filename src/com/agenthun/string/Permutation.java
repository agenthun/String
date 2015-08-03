package com.agenthun.string;

/**
 * Created by Agent Henry on 2015/8/3.
 */
public class Permutation {
    public static void perm(int[] num, int i) {
        if (i < num.length - 1) {
            for (int j = i; j < num.length; j++) {
                int temp = num[j];
                for (int k = j; k > i; k--) {
                    num[k] = num[k - 1];
                }
                num[i] = temp;
                perm(num, i + 1);

                for (int k = i; k < j; k++) {
                    num[k] = num[k + 1];
                }
                num[j] = temp;
            }
        } else {
            for (int j = 1; j < num.length; j++) {
                System.out.print(num[j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[] num = new int[4 + 1];
        for (int i = 1; i < num.length; i++) {
            num[i] = i;
        }

        perm(num, 1);
    }
}
