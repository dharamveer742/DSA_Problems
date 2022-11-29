package Tree;

// TC :- O(N)
// SC :- O(H) 

public class rightView1 {
    int maxlevel=0;
    public void UtilrightView(Node root,int level){
        if(root==null){
            return;
        }
        if(maxlevel<level){
            System.out.println(root.value);
            maxlevel=level;

        }
        UtilrightView(root.right,level+1);
        UtilrightView(root.left,level+1);

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
        rightView1 ob = new rightView1();
        ob.UtilrightView(n1,1);
    }
}
