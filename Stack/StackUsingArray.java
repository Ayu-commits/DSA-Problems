package Stack;

public class StackUsingArray {
    private int data[];
    private int top; // index of topmost element

    public StackUsingArray(int capacity) {
       data = new int[capacity];
       top = -1;
    }

    public boolean isEmpty()
    {
            return (top == -1);
    }

    public int size()
    {
        return top +1;
    }

    public int top() throws StackEmptyException
    {
        if(size() ==0)
        {
            //StackEmptyException
            StackEmptyException e = new StackEmptyException();
            throw e;

        }
        return data[top];
    }

    public void push(int element) throws StackFullException
    {
        if(size() ==  data.length)
        {
            //Stack Full
            StackFullException e = new StackFullException();
            throw e;
        }
        top++;
        data[top] = element;

    }
    public int pop() throws StackEmptyException
    {
        if(size() ==0)
        {
            //StackEmptyException
            StackEmptyException e = new StackEmptyException();
            throw e;

        }
        int temp = data[top];
        top--;
        return temp;
    }
}
