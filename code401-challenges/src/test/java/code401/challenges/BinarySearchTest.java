package code401.challenges;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {
    @Test
    public void binarySearchTruthy(){
        BinarySearch classToTest = new BinarySearch();
        int[] inputArr = {1,2,3,4,5,6};
        int key = 5;
        int output = 4;
        assertEquals("this should return true", output, classToTest.binarySearch(inputArr, key));
    }

    @Test
    public void binarySearchFalsey(){
        BinarySearch classToTest = new BinarySearch();
        int[] inputArr = {4,8,15,16,23,42};
        int key = 8;
        int output = 4;
        assertFalse("this should return false", output == classToTest.binarySearch(inputArr, key));
    }

    @Test
    public void binarySearchEdge(){
        BinarySearch classToTest = new BinarySearch();
        int[] inputArr = new int[0];
        int key = 8;
        int output = -1;
        assertEquals("this should return true", output, classToTest.binarySearch(inputArr, key));
    }

}