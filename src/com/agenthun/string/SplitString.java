package com.agenthun.string;

import java.util.StringTokenizer;

/**
 * Created by Agent Henry on 2015/8/2.
 */
public class SplitString {
    public static String[] stringTokenizer(String str, String delim) {
        if (str == null || str.trim().equals("")) return null;
        StringTokenizer stringTokenizer = new StringTokenizer(str, delim);
        String[] result = new String[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            result[i++] = stringTokenizer.nextToken();
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "123, 45, 25, 85";
        String[] snum = stringTokenizer(s, ", ");
        int[] num = new int[snum.length];

        for (int i = 0; i < snum.length; i++) {
            num[i] = Integer.parseInt(snum[i]);
            System.out.print(num[i] + ", ");
        }

        System.out.println("\n从小到大");
        quickSort1(num, 0, num.length - 1);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }

        System.out.println("\n从大到小");
        quickSort2(num, 0, num.length - 1);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
    }

    public static void quickSort1(int[] a, int left, int right) {
        if (left >= right) return; //这句必须要
        int i = left;
        int j = right;
        int temp = a[i];
        while (i < j) {
            while (i < j && a[j] >= temp) j--; //等号
            if (i < j) a[i++] = a[j];
            while (i < j && a[i] < temp) i++;
            if (i < j) a[j--] = a[i];
        }
        a[i] = temp;
        quickSort1(a, left, i - 1);
        quickSort1(a, i + 1, right);
    }

    public static void quickSort2(int[] a, int left, int right) {
        if (left >= right) return; //这句必须要
        int i = left;
        int j = right;
        int temp = a[i];
        while (i < j) {
            while (i < j && a[j] < temp) j--; //等号
            if (i < j) a[i++] = a[j];
            while (i < j && a[i] >= temp) i++;
            if (i < j) a[j--] = a[i];
        }
        a[i] = temp;
        quickSort2(a, left, i - 1);
        quickSort2(a, i + 1, right);
    }
}
