package Tree;

public class LCA {
    public static Node lca(Node root,Node p,Node q){
        if(root==null || root==p || root==q) return root;
        Node left = lca(root.left,p,q);
        Node right = lca(root.right,p,q);
        if(left==null) return right;
        else if(right == null) return left;
        else return root;

    }

}
