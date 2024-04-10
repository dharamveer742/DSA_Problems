package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Traversals {
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


    // Iterative Inorder Traversal

    public static void iterativeInOrder(Node root){
        Node temp = root;
        Stack<Node> stack = new Stack<>();
        while(true){
            if(temp==null){
                if(stack.isEmpty()) break;
                Node c = stack.pop();
                System.out.println(c.value);
                temp=c.right;
            }
            else{
                stack.push(temp);
                temp=temp.left;
            }
        }
    }

    // iterative postOrder Traversal using 2 stacks

    public static void  iterativePostOrder2stack(Node root){
        if(root ==null) return;
        Stack<Node> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(root);
        while(!stack1.isEmpty()){
            Node temp = stack1.pop();
            stack2.push(temp.value);
            if(temp.left!=null){
                stack1.push(temp.left);
            }
            if(temp.right!=null){
                stack1.push(temp.right);
            }
        }

        System.out.println(stack2);
    }


    // Iterative postOrder traversal using 1 stack
    public static void iterativePostOrder1Stack(Node root){
        if(root==null){
            return;
        }
        List<Integer> ans = new ArrayList<>();
        Node current = root;
        Stack<Node> stack = new Stack<>();
        while(current!=null || !stack.isEmpty()){
            if(current!=null){
                stack.push(current);
                current=current.left;
            }
            else{
                Node temp = stack.peek().right;
                if(temp==null){
                    temp=stack.pop();
                    ans.add(temp.value);
                    while(!stack.isEmpty() && temp == stack.peek().right){
                        temp=stack.pop();
                        ans.add(temp.value);
                    }
                }
            }
        }
        System.out.println(ans);
    }


    // BFS traversal or level order traversal  // TC =O(N) & SC = O(N)
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



    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right =  new Node(5);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(7);

        System.out.println("recursive preOrder");
        preOrder(root);
        System.out.println("iterative preOrder");
        iterativePreOrder(root);
        System.out.println("recursive inOrder");
        inOrder(root);
        System.out.println("iterative inOrder");
        iterativeInOrder(root);
        System.out.println("recursive postOrder");
        postOrder(root);
        System.out.println("iterative PostOrder using 2 stack");
        iterativePostOrder2stack(root);
        System.out.println("Iterative PostOrder using 1 stack");
        iterativePostOrder1Stack(root);
        System.out.println("finnished");


    }



}
