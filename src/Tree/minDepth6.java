package Tree;

public class minDepth6{
    public static int minDepth(Node root){
        if(root==null){
            return 0;
        }
        int left=minDepth(root.left);
        int right=minDepth(root.right);
        if(left==0 || right ==0){
            return 1+Math.max(left,right);
        }
        else{
            return 1+Math.min(left,right);
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(5);
        Node n2 = new Node(10);
        Node n3 = new Node(15);
        Node n4 = new Node(20);
        Node n5 = new Node(25);
        n1.left=n2;
        n1.right=n3;
        n3.right=n4;
        n4.right=n5;
        int ans = minDepth(n1);
        System.out.println(ans);

    }


}
