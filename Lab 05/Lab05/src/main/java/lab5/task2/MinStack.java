package lab5.task2;

import java.util.Stack;

public class MinStack extends Stack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public static int min=0;

    void Push(int x)
    {
        if (isEmpty())
        {
            stack.push(x);
            minStack.push(x);
        }
        else
        {
            stack.push(x);
            int y = minStack.peek();
            if(x<y)
            {
                minStack.push(x);
            }
            else
            {
                minStack.push(y);
            }
        }
    }
    public void Pop()
    {
        minStack.pop();
        stack.pop();
    }
    int getMin()
    {
        int x = minStack.pop();
        minStack.push(x);
        return x;
    }
}

