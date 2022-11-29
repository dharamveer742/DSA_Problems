package linkedList;

public class swapNodesInPairs {

    public static void main(String[] args) {
        node n1 = new node(1);
        node n2 = new node(2);
        node n3 =  new node(3);
        node n4 = new node(4);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        traverseList((swapNodes(n1)));
    }
    public static node swapNodes(node head){
        if(head==null || head.next==null){
            return  head;
        }
        node p1=head;
        node p2=p1.next;
        node p3=p2.next;
        p1.next=p3;
        p2.next=p1;
        if(p3!=null){
            p1.next=swapNodes(p3);
        }
        return p2;
    }
    public static void traverseList(node head){
        node current = head ;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.println("null");
    }
}
