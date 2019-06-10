package code401.challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    //test to see if the queue class can add one node to its back
    @Test
    public void testSingleEnqueue(){
        Queue classUnderTest = new Queue();
        classUnderTest.enqueue(10);
        Integer expectedOutput = 10;
        assertEquals("This should return true if the two values are the same", expectedOutput, classUnderTest.peek());
    }

    //test to see if the queue class can add multiple nodes to its back
    @Test
    public void testMultipleEnqueue(){
        Queue classUnderTest = new Queue();
        classUnderTest.enqueue(10);
        classUnderTest.enqueue(20);
        classUnderTest.enqueue(30);
        Integer expectedOutput = 10;
        assertEquals("This should return true if the two values are the same", expectedOutput, classUnderTest.peek());
    }

    //test to see if the queue class can remove a node from the front of the queue
    @Test
    public void testDequeue(){
        Queue classUnderTest = new Queue();
        classUnderTest.enqueue(10);
        classUnderTest.enqueue(20);
        classUnderTest.enqueue(30);
        classUnderTest.dequeue();
        Integer expectedOutput = 20;
        assertEquals("This should return true if the two values are the same", expectedOutput, classUnderTest.peek());
    }

    //test to see if the queue class returns the value at the front of the queue
    @Test
    public void testPeek(){
        Queue classUnderTest = new Queue();
        classUnderTest.enqueue(10);
        classUnderTest.enqueue(20);
        Integer expectedOutput = 10;
        assertEquals("This should return true if the two values are the same", expectedOutput, classUnderTest.peek());
    }

    //test to see if the queue class returns null when it is empty
    @Test
    public void testEmptyQueue(){
        Queue classUnderTest = new Queue();
        classUnderTest.enqueue(10);
        classUnderTest.enqueue(20);
        classUnderTest.dequeue();
        classUnderTest.dequeue();
        assertNull("This should return true if the queue is empty", classUnderTest.peek());
    }

    //test to see if the queue class instantiates an empty queue when it is first created
    @Test
    public void testInstantiateEmptyQueue(){
        Queue classUnderTest = new Queue();
        assertNull("This should return true if the queue is empty", classUnderTest.peek());
    }
}