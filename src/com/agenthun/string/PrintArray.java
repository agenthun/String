package com.agenthun.string;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Agent Henry on 2015/7/24.
 */

public class PrintArray {
    private int[] numbers = new int[]{1, 2, 2, 3, 4, 5};
    private int n = numbers.length;
    //标记图结点是否遍历
    private boolean[] visited = new boolean[n];
    //图的二维数组表示
    private int[][] graph = new int[n][n];

    private String combination = "";

    public Set<String> getAllCombinations() {
        buildGraph();
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < n; i++) {
            this.depthFirstSearch(i, set);
        }
        return set;
    }

    private void buildGraph() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) graph[i][j] = 0;
                else graph[i][j] = 1;
            }
        }
        graph[3][5] = 0;
        graph[5][3] = 0;
    }

    private void depthFirstSearch(int start, Set<String> set) {
        visited[start] = true;
        combination = combination + numbers[start];
        if (combination.length() == n) {
            //4不出现在第三个位置
            if (combination.indexOf("4") != 2) set.add(combination);
        }
        for (int i = 0; i < n; i++) {
            if (graph[start][i] == 1 && visited[i] == false) depthFirstSearch(i, set);
        }
        combination = combination.substring(0, combination.length() - 1);
        visited[start] = false;
    }

    public static void main(String[] args) {
        PrintArray printArray = new PrintArray();
        Set<String> set = printArray.getAllCombinations();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            System.out.println(s);
        }
    }
}
