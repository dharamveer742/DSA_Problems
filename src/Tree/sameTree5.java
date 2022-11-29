package Tree;

public class sameTree5 {

    public boolean isSameTree(Node2 p,Node2 q){
        if(p==null && q==null){
            return true;
        }
        if((p==null && q!=null) || (p!=null && q==null )){
            return false;
        }
        if(p.data != q.data){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    public static void main(String[] args) {
        Node2 p1=new Node2(10);
        Node2 q1= new Node2(10);
        Node2 p2= new Node2(5);
        Node2 q2= new Node2(5);

        p1.left=p2;
        q1.right=q2;

        sameTree5 ob = new sameTree5();
        boolean ans = ob.isSameTree(p1,q1);
        System.out.println(ans);
    }


}
class Node2{
    int data;
    Node2 left;
    Node2 right;
    Node2(int val){
        this.data=val;
    }
}

