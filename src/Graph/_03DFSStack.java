package Graph;
import java.util.*;
public class _03DFSStack {


    private int vertices;
    private LinkedList<Integer>[] adjList;

    _03DFSStack(int v) {
        vertices = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int u, int v) {
        adjList[u].add(v);
    }

    void dfs(int start) {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();

        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited[node]) {
                System.out.print(node + " ");
                visited[node] = true;

                // Push neighbors in reverse order
                List<Integer> neighbors = adjList[node];
                for (int i = neighbors.size() - 1; i >= 0; i--) {
                    int n = neighbors.get(i);
                    if (!visited[n]) {
                        stack.push(n);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        _03DFSStack graph = new _03DFSStack(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);

        System.out.print("DFS Traversal: ");
        graph.dfs(0);
    }

}
