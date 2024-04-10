package Tree;

import java.util.ArrayList;
import java.util.List;

public class BoundaryLevelTraversal {
    public static boolean isLeaf(Node root){
        if(root.left==null && root.right==null) return true;
        else return false;
    }

    public static void leftBoundary(Node root,ArrayList<Integer> ans){
        Node curr = root.left;
       while(curr!=null){
           if(isLeaf(curr)==false) ans.add(curr.value);
           if(curr.left!=null) curr = curr.left;
           else curr=curr.right;
       }
    }
    public static void addLeaves(Node root,ArrayList<Integer> ans){
        if(isLeaf(root)) ans.add(root.value);
        if(root.left!=null) addLeaves(root.left,ans);
        if(root.right!=null) addLeaves(root.right,ans);

    }

    public static  void rightBoundary(Node root, List<Integer> res) {
        Node curr = root.right;
        List<Integer> temp = new ArrayList<>();
        while (curr != null) {
            if (!isLeaf(curr)) {
                temp.add(curr.value);
            }
            if (curr.right != null) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }
        for (int i = temp.size() - 1; i >= 0; --i) {
            res.add(temp.get(i));
        }
    }


    public static void boundaryTraversal(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return;
        if(!isLeaf(root)) ans.add(root.value);
        leftBoundary(root,ans);
        addLeaves(root,ans);
        rightBoundary(root,ans);

    }
}


// In leaf Traversal, any traversal ( Preorder, Inorder, Postorder ) will work because we are printing left subtree first before right subtree
//