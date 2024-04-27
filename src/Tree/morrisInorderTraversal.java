package Tree;

import java.util.ArrayList;
import java.util.List;

public class morrisInorderTraversal {

    public static void morris(Node root){
        List<Integer> ans = new ArrayList<>();
        Node current = root ;
        while(current!=null){
            if(current.left==null){
                ans.add(current.value);
                current=current.right;
            }
            else{
                Node prev = current.left;
                while(prev.right!=null && prev.right!=current){
                    prev = prev.right;
                }
                if(prev.right==null){
                    prev.right = current;
                    current = current.left;
                }
                else{
                    prev.right=null;
                    ans.add(current.value);
                    current = current.right;
                }
            }
        }
        System.out.println(ans);
    }
/*
    public static void KthLargest(Node root, int k) {
        Node curr = root;
        int Klargest = -1;
        // count variable to keep count of visited Nodes
        int count = 0;
        while (curr != null) {
            // if right child is NULL
            if (curr.right == null) {
                // first increment count and check if count = k
                if (++count == k) Klargest = curr.value;
                curr = curr.left;
            } else {
                // find inorder successor of current Node
                Node succ = curr.right;
                while (succ.left != null && succ.left != curr)
                    succ = succ.left;

                if (succ.left == null) {
                    // set left child of successor to the
                    // current Node
                    succ.left = curr;
                    // move current to its right
                    curr = curr.right;
                }
                // restoring the tree back to original binary
                // search tree removing threaded links
                else {
                    succ.left = null;
                    if (++count == k) Klargest = curr.value;
                    curr = curr.left;
                }
            }
        }
        System.out.println(Klargest);
    }
  */
    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.left = new Node(2);
        n1.right = new Node(3);
        n1.left.left = new Node(4);
        n1.left.right = new Node(5);
        n1.left.right.right = new Node(6);
        morris(n1);
        
       // KthLargest(n1,2);

    }
}
