package code401.challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {


    @Test
    public void testInsertShiftArrayOdd() {
        ArrayShift classUnderTest = new ArrayShift();
        int[] arr = {4,8,15,23,42};
        int value  = 16;
        int[] expectedOutput = {4,8,15,16,23,42};
        assertArrayEquals("this should return 'true'", expectedOutput, classUnderTest.insertShiftArray(arr, value));
    }


    @Test
    public void testInsertShiftArrayEdge() {
        ArrayShift classUnderTest = new ArrayShift();
        int[] arr = new int[0];
        int value  = 16;
        int[] expectedOutput = {16};
        assertArrayEquals("this should return true", expectedOutput, classUnderTest.insertShiftArray(arr, value));
    }

    @Test
    public void testInsertShiftArrayEven() {
        ArrayShift classUnderTest = new ArrayShift();
        int[] arr = {4,8,15,23,42,12};
        int value  = 5;
        int[] expectedOutput = {4,8,15,5,23,42,12};
        assertArrayEquals("this should return true", expectedOutput, classUnderTest.insertShiftArray(arr, value));
    }
}