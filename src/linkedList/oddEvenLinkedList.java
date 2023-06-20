package linkedList;

public class oddEvenLinkedList {
    public static Node segregate(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node odd = head;
        Node even = head.next;
        Node headEven = even;
        while(even!=null && even.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next = headEven;
        return head;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 =  new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        Node newList = segregate(n1);

        while(newList!=null){
            System.out.println(newList.data);
            newList=newList.next;
        }
    }
}
