package Tree;

public class childrenSumProperty {

    public static void changeTree(Node root){
        if(root==null) return;;
        int children = 0;
        if(root.left!=null){
            children+=root.left.value;
        if(root.right!=null){
            children+=root.right.value;
        }

        if(children>= root.value){
            root.value=children;
        }
        else{
            if(root.left!=null) root.left.value= root.value;
            if(root.right!=null) root.right.value = root.value;
        }
        changeTree(root.left);
        changeTree(root.right);

        int tot = 0;
        if(root.left!=null) tot+=root.left.value;
        if(root.right!=null) tot+=root.right.value;
        if(root.left!=null || root.right!=null) root.value = tot;


    }

}
