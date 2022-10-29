package LinkedList;

public class InsertAtBegining extends Test{
    static Node insertBegin(Node head, int x){
        Node temp=new Node(x);
        temp.next=head;
        return temp;
    }
    public static void printlist(Node head)
    {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
