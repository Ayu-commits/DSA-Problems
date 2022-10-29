package LinkedList;

import static LinkedList.DeleteSingleLinkedList.deleteHead;
import static LinkedList.InsertAtBegining.insertBegin;
import static LinkedList.InsertAtBegining.printlist;

public class Test {
    public static void main(String[] args) {
        Node head=null;
        head=insertBegin(head,30);
        head=insertBegin(head,20);
        head=insertBegin(head,10);
        head = deleteHead(head);
        printlist(head);
    }
    public static void rPrint(Node head) // recusion ke liye T.C = O(N)
    {
        if(head == null)
            return;
        System.out.print(head.data+ " ");
        rPrint(head.next);
    }

    public static void printList(Node head){
        Node current = head;
        while(current!=null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }

    }

}
