package Graph;

import java.util.ArrayList;

public class _03numberOfConnectedComponents {

    // Leetcode 2685
    // Given n nodes labeled from 0 to n - 1 and a list of undirected edges (each edge is a pair of nodes),
    // write a function to find the number of connected components in an undirected graph.

    // n = 5 and edges = [[0, 1], [1, 2], [3, 4]] Output: 2

    // Note: You can assume that no duplicate edges will appear in edges.
    // Since all edges are undirected, [0, 1] is the same as [1, 0] and thus will not appear together in edges.

    public static int countComponents(int n,int[][] edges){

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        int count =0;
        boolean[] visited = new boolean[n];
        for(int v=0;v<n;v++){
            if(visited[v]==false){
                count++;
                dfs(v,adj,visited);
            }
        }
        return count;
    }

    public static void dfs(int n,ArrayList<ArrayList<Integer>> adj, boolean[] visited){
        visited[n] = true;
        for(int it:adj.get(n)){
            if(visited[it]==false){
                dfs(it,adj,visited);
            }
        }
    }

    public static void main(String[] args) {
        int n=5;
        //int[][] edges = {{0,1},{1,2},{3,4}};
        int[][] edges =  {{0,1},{1,2},{2,3},{3,4}};
        System.out.println(countComponents(n,edges));
    }

}
