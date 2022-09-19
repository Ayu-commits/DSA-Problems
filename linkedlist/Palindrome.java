package linkedlist;


import java.util.ArrayDeque;
import java.util.Deque;

class Node {
    char data;
    Node next;

    Node(char x)
    {
        data = x;
        next = null;
    }
}
class Palindrome {
    public static void main(String args[])
    {
        Node head = new Node('g');
        head.next = new Node('f');
        head.next.next=new Node('g');
        if(naive(head))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
    static boolean naive(Node head) // O(N) T.C and S.C
    {
        Deque<Character> st = new ArrayDeque<Character>();
        for(Node curr = head;curr!=null;curr = curr.next)
        {
            st.push(curr.data);
        }
        for(Node curr = head; curr!=null;curr = curr.next)
        {
            if(st.pop() != curr.data)
                return false;
        }
        return true;

    }
    static Node reverseList(Node head){
        if(head==null||head.next==null)return head;
        Node rest_head=reverseList(head.next);
        Node rest_tail=head.next;
        rest_tail.next=head;
        head.next=null;
        return rest_head;
    }
    static boolean Optimal(Node head)
    {
        if(head == null) return true;
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null) // condition check karta ke two pointer approach ke liye
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node rev = reverseList(slow.next);
        Node curr = head;
        while(rev!= null)
        {
            if(rev.data!= curr.data)  // check krta sam ehai ke nhi
                return false;
            rev = rev.next;
            curr= curr.next;
        }
        return true;
    }


}
