package Stack;

public class StackUse {
    public static void main(String[] args) throws StackFullException, StackEmptyException {
        int capacity = 12;
        StackUsingArray stack = new StackUsingArray(capacity) ;
        for(int i =1;i<=5;i++){
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }

    }

}
