package LinkedList;

public class DeleteSingleLinkedList extends Test {
    static Node deleteHead(Node head)
    {
        if(head == null)
            return null;
        else
            return head.next;
    }

}
