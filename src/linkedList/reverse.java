package linkedList;

public class reverse {

    public static node reverse(node head){
        return reverseRecursively(head,head);
    }
    public static node reverseRecursively(node head,node headRef){
        if(head==null){
            return  null;
        }
        node first = head;
        node rest = first.next;
        if(rest==null){
            return first;
        }
        headRef=reverseRecursively(rest,rest);
        rest.next=first;
        first.next=null;

        return headRef;
    }

    public static void main(String[] args) {
        node n1 = new node(10);
        node n2 = new node(20);
        node n3 =  new node(30);
        node n4 = new node(40);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        System.out.println(reverse(n1).next.data);

    }

}
class node{
    int data;
    node next;
    node(int d){
        data=d;
    }
}