package code401.challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    //test to see if the stack class can push one value to the top of the stack
    @Test
    public void testPushOneValueIntoStack(){
        Stack classUnderTest = new Stack();
        classUnderTest.push(10);
        Integer expectedOutput = 10;
        assertEquals("This should be true if the two values are the same", expectedOutput, classUnderTest.peek());
    }

    //test to see if the stack class can push multiple values to the top of the stack
    @Test
    public void testPushMultipleValueIntoSatck(){
        Stack classUnderTest = new Stack();
        classUnderTest.push(10);
        classUnderTest.push(20);
        classUnderTest.push(30);
        classUnderTest.push(40);
        Integer expectedOutput = 40;
        assertEquals("This should be true if the two values are the same", expectedOutput, classUnderTest.peek());
    }

    //test to see if the stack class can remove a value from the top of the stack
    @Test
    public void testPopValueFromStack(){
        Stack classUnderTest = new Stack();
        classUnderTest.push(10);
        classUnderTest.push(20);
        classUnderTest.push(30);
        classUnderTest.push(40);
        classUnderTest.pop();
        classUnderTest.pop();
        Integer expectedOutput = 20;
        assertEquals("This should be true if the two values are the same", expectedOutput, classUnderTest.peek());
    }

    //test to see if the stack class returns null when the stack is empty
    @Test
    public void testEmptyStack(){
        Stack classUnderTest = new Stack();
        classUnderTest.push(10);
        classUnderTest.push(20);
        classUnderTest.push(30);
        classUnderTest.pop();
        classUnderTest.pop();
        classUnderTest.pop();
        assertNull("This should return true if the stack is empty", classUnderTest.peek());
    }

//test to see if the stack class can return the value at the top of the stack
    @Test
    public void testPeekStack(){
        Stack classUnderTest = new Stack();
        classUnderTest.push(10);
        classUnderTest.push(20);
        classUnderTest.push(30);
        Integer expectedOutput = 30;
        assertEquals("This should be true if the two values are the same", expectedOutput, classUnderTest.peek());
    }

    //test to see if the stack class can successfully instantiate an empty stack when it is first created
    @Test
    public void testInstantiateEmptyStack(){
        Stack classUnderTest = new Stack();
        assertNull("This should return true if the stack is empty", classUnderTest.peek());

    }

}