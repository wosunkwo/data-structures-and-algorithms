package code401.challenges.queueWithStacks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void testSingleEngueue(){
        PseudoQueue classUnderTest = new PseudoQueue();
        classUnderTest.enqueue(10);
        Integer expectedOutput = 10;
        assertEquals("This should return true if both values are equal", expectedOutput, classUnderTest.dequeue());
    }

    @Test
    public void testMultipleEngueue(){
        PseudoQueue classUnderTest = new PseudoQueue();
        classUnderTest.enqueue(20);
        classUnderTest.enqueue(10);
        classUnderTest.enqueue(30);
        Integer expectedOutput = 20;
        assertEquals("This should return true if both values are equal", expectedOutput, classUnderTest.dequeue());
    }

    @Test
    public void testExpectedFailure(){
        PseudoQueue classUnderTest = new PseudoQueue();
        assertNull("This should return null", classUnderTest.dequeue());
    }

    @Test
    public void testEdgeCase(){
        PseudoQueue classUnderTest = new PseudoQueue();
        classUnderTest.enqueue(20);
        classUnderTest.enqueue(10);
        classUnderTest.enqueue(30);
        classUnderTest.dequeue();
        classUnderTest.dequeue();
        Integer expectedOutput = 30;
        assertEquals("This should return true if the values are the same", expectedOutput, classUnderTest.dequeue());
    }

}

