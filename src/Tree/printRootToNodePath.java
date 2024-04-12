package Tree;

import java.util.ArrayList;
import java.util.List;

public class printRootToNodePath {

    public static boolean path(Node root, int x, List<Integer> ans){
        if(root == null) return false;
        ans.add(root.value);
        if(root.value==x) return true;

        if(path(root.left,x,ans) || path(root.right,x,ans)) return true;

        ans.remove(ans.size()-1);

        return false;
    }

    public static List<Integer> solve(Node A, int B) {

        List<Integer> arr = new ArrayList<>();


        if (A == null) {
            return arr;
        }

        path(A, B,arr);


        return arr;
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);
        List<Integer> ans = solve(root,7);
        System.out.println(ans);
    }


}
