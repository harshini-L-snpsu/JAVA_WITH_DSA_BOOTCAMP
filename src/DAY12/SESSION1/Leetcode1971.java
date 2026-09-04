package DAY12.SESSION1;

import java.util.ArrayList;

public class Leetcode1971 {

    public boolean checkPath(int n, int[][] edges, int src, int des) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int src_edge = edge[0];
            int des_edge = edge[1];
            graph.get(src_edge).add(des_edge);
            graph.get(des_edge).add(src_edge);

        }
        boolean [] visited= new boolean[n];

        visited = new boolean[n];
        return dfs(src, des, graph, visited);
    }

    public boolean dfs(int current, int des, ArrayList<ArrayList<Integer>> graph,boolean [] visited) {
        if (current == des) {
            return true;
        }

        visited[current] = true;

        for (int nbr : graph.get(current)) {
            if (!visited[nbr]) {
                if (dfs(nbr, des, graph, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {
            {0, 1},
            {1, 2},
            {2, 0}
        };
        int src = 0;
        int des = 2;

        Leetcode1971 ans= new Leetcode1971();
        System.out.println(ans.checkPath(n, edges, src, des));
    }
}
