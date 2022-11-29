package Tree;

class Node{
    Node left;
    Node right;
    int value;
    Node(int value){
        this.value=value;
    }
}
public class MirrorImage2 {
    public static void findMirrorImage(Node originalRoot,Node newRoot){
        if(originalRoot==null){
            return;
        }
        if(originalRoot.left!=null){
            newRoot.right=new Node(originalRoot.left.value);
            findMirrorImage(originalRoot.left,newRoot.right);
        }
        if(originalRoot.right!=null){
            newRoot.left=new Node(originalRoot.right.value);
            findMirrorImage(originalRoot.right,newRoot.right);
        }

    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);

    }

    public static void main(String[] args) {
        Node n1=new Node(5);
        Node n2=new Node(3);
        Node n3=new Node(6);
        Node n4=new Node(2);
        Node n5=new Node(4);
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;

        Node newN1 = new Node(n1.value);
        findMirrorImage(n1,newN1);
        inOrder(newN1);

    }
    
}
