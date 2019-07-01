package code401.challenges.insertionSort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {
    int[] happyArr;
    int[] edgeArr;
    int[] expectedFailure;
    InsertionSort classUnderTest = new InsertionSort();

    @Before
    public void initializeArr(){
        happyArr = new int[] {7,2,4,1,3,9};
        edgeArr = new int[] {1,1,0,0,0,1};
        expectedFailure = new int[] {};
    }

    @Test
    public void happyPath(){
        int[] expectedOutout = new int[] {1,2,3,4,7,9};
        assertArrayEquals("This should return true if the expected output and the array the method returns are the same", expectedOutout, classUnderTest.InsertionSort(happyArr));
    }

    @Test
    public void edgeCase(){
        int[] expectedOutout = new int[] {0,0,0,1,1,1};
        assertArrayEquals("This should return true if the expected output and the array the method returns are the same", expectedOutout, classUnderTest.InsertionSort(edgeArr));
    }

    @Test
    public void expectedFailure(){
        int[] expectedOutout = new int[] {};
        assertArrayEquals("This should return true if the expected output and the array the method returns are the same", expectedOutout, classUnderTest.InsertionSort(expectedFailure));
    }

    }

