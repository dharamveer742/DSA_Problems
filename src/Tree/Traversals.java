package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class DFS {
    // preOrder Traversal , inOrder Traversal , postOrder Traversal  TC =O(N) & SC = O(N)

    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.value);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.value);
    }


    // Iterative DFS Traversals

    public static void iterativePreOrder(Node root){
        if(root==null){
            return;
        }
        Stack<Node> st = new Stack<>();
        List<Integer> preOrder = new ArrayList<>();
        st.push(root);
        while(!st.isEmpty()){
            Node popped = st.pop();
            preOrder.add(popped.value);
            if(popped.right!=null) st.push(popped.right);
            if(popped.left!=null) st.push(popped.left);
        }
        System.out.println(preOrder);
    }





    // BFS traversal  // TC =O(N) & SC = O(N)

    public static void levelOrder(Node root){

        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList();
        if(root==null){
            return ;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int cnt=q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=1;i<=cnt;i++){
                Node temp=q.poll();
                level.add(temp.value);
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
            ans.add(level);
        }
        System.out.println(ans);

    }



}
