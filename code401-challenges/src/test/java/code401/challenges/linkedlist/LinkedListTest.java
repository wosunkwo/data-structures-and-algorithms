package code401.challenges.linkedlist;

import code401.challenges.Library;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LinkedListTest {
    //test case for when the linked list is empty
        @Test
        public void testEmptyList() {
            LinkedList classUnderTest = new LinkedList();
            assertNull("this should return null", classUnderTest.print());
        }

        //test case to check if the function can insert one value into the linked list
        @Test
        public void testForInsert(){
            LinkedList classUnderTest = new LinkedList();
            int[] expectedOutput = {1};
            classUnderTest.insert(1);
            assertArrayEquals("This should return true if the expected array and result array are the same", expectedOutput, classUnderTest.print());
        }

        //test case to check if the head points to the first value in the linked list
    @Test
    public void testForHead(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(1);
        classUnderTest.insert(2);
        int[] resultArr = classUnderTest.print();
        assertTrue("This should return true if the first element in the head points to the first value in the linked list ", 2 == resultArr[0] );
    }

    //test to check if the linked list class can insert multiple values
    @Test
    public void testForMultipleInsert(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(0);
        classUnderTest.insert(1);
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        int[] expectedOutput = {3,2,1,0};
        assertArrayEquals("This should return true if the test array is the same thing as the array we get back from the linked list ", expectedOutput, classUnderTest.print() );
    }

    //test to check if the includes method returns true if the value we are searching for is in the linked list
    @Test
    public void testForReturnTrue(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(0);
        classUnderTest.insert(1);
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        assertTrue("This should return true if the linked list contains the value we are looking for ", classUnderTest.includes(2));
    }

    //test to check if the includes method returns false if the value we are searching for is not in the linked list
    @Test
    public void testForReturnFalse(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(0);
        classUnderTest.insert(1);
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        assertFalse("This should return false if the linked list does not contains the value we are looking for ", classUnderTest.includes(4));
    }
}