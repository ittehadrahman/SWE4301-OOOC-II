package lab5.task2;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinStackTest {
    @Test
    void minOne()
    {
        MinStack STACK = new MinStack();
        STACK.Push(3);
        STACK.Push(2);
        STACK.Push(5);
        STACK.Push(1);
        assertEquals(1, STACK.getMin());
    }
    @Test
    void popMin()
    {
        MinStack STACK = new MinStack();
        STACK.Push(3);
        STACK.Push(2);
        STACK.Push(5);
        STACK.Push(1);
        STACK.Pop();
        assertEquals(5, STACK.getMin());
    }
    @Test
    void minThree()
    {
        MinStack STACK = new MinStack();
        STACK.Push(1);
        STACK.Push(1);
        STACK.Push(1);
        STACK.Push(2);
        STACK.Pop();
        STACK.Pop();
        assertEquals(1, STACK.getMin());
    }
}
