package linkedList;

public class reverse {


    public static Node reverseRecursively(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead= reverseRecursively(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;

    }



    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 =  new Node(30);
        Node n4 = new Node(40);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        System.out.println(reverseRecursively(n1).next.next.data);

    }

}
