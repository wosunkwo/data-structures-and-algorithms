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
        assertEquals("This should return true if the first element in the head points to the first value in the linked list ", 2, classUnderTest.head.value);
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

    //************************************ Test for Code Challenge 6 ********************

    // Test to see if my append method successfully adds a new value to the end of my linked list
    @Test
    public void testForAddAtEndOfList(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(4);
        classUnderTest.insert(3);
        classUnderTest.insert(2);
        classUnderTest.insert(1);
        classUnderTest.append(5);
        int [] resultArr = classUnderTest.print();
        int expectedOutput = 5;
        assertEquals("This should return true if the value at the end of the linked list is the same as the expected value ", expectedOutput, resultArr[resultArr.length - 1]);
    }

    //Test to see if my append method successfully adds multiple new values to the end of the linked list
    @Test
    public void testForAddMultipleNodesAtEndOfList(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.append(1);
        classUnderTest.append(2);
        classUnderTest.append(3);
        int[] resultArr = classUnderTest.print();
        int[] expectedOutput = {1,2,3};
        assertArrayEquals("This should return true if the array return by the linked list is the same as the expected array that should be returned ", expectedOutput, resultArr);
    }

    //Test to see if the insertBefore method successfully adds a new value before a specified value at the middle of the linked list
    @Test
    public void testForInsertBeforeAtMiddle(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.append(0);
        classUnderTest.append(1);
        classUnderTest.append(3);
        classUnderTest.append(4);
        classUnderTest.insertBefore(3,10);
        int[] resultArr = classUnderTest.print();
        int expectedOutput = 10;
        assertEquals("This should return true if the array return by the linked list has the correct value we inserted in it ", expectedOutput, resultArr[2]);
    }

    //Test to see if the insertBefore method successfully adds a new node before the first node of the linked list
    @Test
    public void testForInsertBeforeFirstNode(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.append(0);
        classUnderTest.append(1);
        classUnderTest.append(2);
        classUnderTest.append(3);
        classUnderTest.insertBefore(0,10);
        int[] resultArr = classUnderTest.print();
        int expectedOutput = 10;
        assertEquals("This should return true if the array return by the linked list has the value we added to it at the front of the linked list ", expectedOutput, resultArr[0]);
    }

    //Test to see if the insertAfter method successfully adds a new value after a specified value at the middle of the linked list
    @Test
    public void testForInsertAfterAtMiddle(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.append(0);
        classUnderTest.append(1);
        classUnderTest.append(2);
        classUnderTest.append(3);
        classUnderTest.insertAfter(2,10);
        int[] resultArr = classUnderTest.print();
        int expectedOutput = 10;
        assertEquals("This should return true if the array return by the linked list has the correct value we inserted in it ", expectedOutput, resultArr[3]);
    }

    //Test to see if the insertAfter method successfully adds a new node after the last node of the linked list
    @Test
    public void testForInsertAfterLastNode(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.append(0);
        classUnderTest.append(1);
        classUnderTest.append(2);
        classUnderTest.append(3);
        classUnderTest.insertAfter(3,10);
        int[] resultArr = classUnderTest.print();
        int expectedOutput = 10;
        assertEquals("This should return true if the array return by the linked list has the value we added to it at its last node ", expectedOutput, resultArr[resultArr.length-1]);
    }


    //******************* Test Cases for K- Nth Value Challenge
    @Test(expected = IllegalArgumentException.class)
    public void testForKnthGreaterThan(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.append(1);
        classUnderTest.knthFromEnd(2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForKnthTheSame(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.append(1);
        classUnderTest.knthFromEnd(1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForKnthNegative(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.append(1);
        classUnderTest.knthFromEnd(-1);
    }

    @Test
    public void testForKnthSizOnee(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.append(8);
        int expectedOutput = 8;
        assertEquals("This should be true if the expected output is the same as the output the class method returns", expectedOutput, classUnderTest.knthFromEnd(0));
    }

    @Test
    public void testForKnthHappyPath(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.append(1);
        classUnderTest.append(3);
        classUnderTest.append(8);
        classUnderTest.append(2);
        int expectedOutput = 3;
        assertEquals("This should be true if the expected output is the same as the output the class method returns", expectedOutput, classUnderTest.knthFromEnd(2));
    }

}