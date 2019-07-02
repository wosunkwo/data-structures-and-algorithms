package code401.challenges.mergeSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {


    @Test
    public void mergeHappyTest() {
        MergeSort classUnderTest = new MergeSort();
        int[] arr =  {5, 7, 2, 8, 1, 3};
        int[] expectedOutput = {1, 2, 3, 5, 7, 8};
        classUnderTest.mergeSortFunc(arr);
        assertArrayEquals("Arrays should be equal", expectedOutput, arr);
    }

    @Test
    public void mergeEdgeCase() {
        MergeSort classUnderTest = new MergeSort();
        int[] arr = {-5, -2, -100, -10, -1};
        int[] expectedOutput = {-100, -10, -5, -2, -1};
        classUnderTest.mergeSortFunc(arr);
        assertArrayEquals("Arrays should be equal", expectedOutput, arr);
    }

    @Test
    public void mergeEmptyArray() {
        MergeSort classUnderTest = new MergeSort();
        int[] arr = {};
        int[] expectedOutput = {};
        classUnderTest.mergeSortFunc(arr);
        assertArrayEquals("Arrays should be equal", expectedOutput, arr);
    }
}