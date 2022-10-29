package LinkedList;

public class InsertAtEnd {
    public Node insertEnd(Node head,int x)
    {
        Node temp = new Node(x);
        if(head == null)
            return head;
        Node current = head;
        while(current.next!=null)
            current = current.next;
        current.next=temp;
        return head;

    }
}
