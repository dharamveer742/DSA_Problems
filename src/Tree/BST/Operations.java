package Tree.BST;

public class Operations {

    public Node insert(Node root, int val){
        if(root==null){
            return new Node(val);
        }
        if(val<root.data){
            root.left=insert(root.left,val);
        }
        if(val>root.data){
            root.right=insert(root.right,val);
        }
        return root;
    }

}
class Node{
    int data;
    Node left;
    Node right;
    Node(int val){
        this.data=val;
    }
}