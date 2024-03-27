package Task01test;
import Task01.GenericMaxStack;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class MaxStackTest {
    @Test
    void testOne()
    {
        GenericMaxStack STACK = new GenericMaxStack();
        STACK.Push(3);
        STACK.Push(5);
        STACK.Push(2);
        assertEquals(5, STACK.max());
    }
    @Test
    void testTwo()
    {
        GenericMaxStack STACK = new GenericMaxStack();
        STACK.Push(2);
        STACK.Push(1);
        STACK.Push(2);
        STACK.Push(5);
        STACK.pop();
        assertEquals(2, STACK.max());
        STACK.pop();
        assertEquals(2, STACK.max());
    }
    @Test
    void testThree()
    {
        var STACK = new GenericMaxStack();
        STACK.Push(49.75);
        STACK.Push(23.54);
        STACK.Push(100.0);
        STACK.pop();
        assertEquals(49.75, STACK.max());
    }
    @Test
    void testFour()
    {
        GenericMaxStack STACK = new GenericMaxStack();
        STACK.Push("OOC is bad");
        STACK.Push("Nothing to understand");
        STACK.Push("Try hard");
        assertEquals( "Try hard", STACK.max());
        STACK.pop();
        assertEquals( "OOC is bad", STACK.max());
    }
}
