package Tree;

public class countTotalNodesInACompleteBinaryTree {

    public static int leftHeight(Node root){
         int height =0;
         Node current =root;
         while(current!=null){
             height ++;
             current=current.left;
         }
         return height;
    }
    public static int rightHeight(Node root){
        int height = 0;
        Node current =root;
        while(current!=null){
            height++;
            current=current.right;
        }
        return height;
    }

    public static int countNodes(Node root){
        if(root==null) return 0;
        int lh = leftHeight(root.left);
        int rh = rightHeight(root.right);
        if(lh==rh) return (1<<lh)-1;
        return  1+countNodes(root.left)+countNodes(root.right);
    }

    public static void main(String[] args) {

    }


}
