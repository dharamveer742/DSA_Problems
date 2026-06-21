package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _01BFS {

    public static void bfsTraversal(int v,ArrayList<ArrayList<Integer>> adj,int startingNode){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[v];
        ArrayList<Integer> bfs = new ArrayList<>();
        q.offer(startingNode);
        visited[startingNode]=true;
        while(!q.isEmpty()){
            int polled = q.poll();
            bfs.add(polled);
            for(Integer it : adj.get(polled)){
                if(visited[it]==false){
                    q.offer(it);
                    visited[it]=true;
                }
            }
        }
        System.out.println(bfs);
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 5;
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);

        bfsTraversal(v,adj,0);

    }

}
