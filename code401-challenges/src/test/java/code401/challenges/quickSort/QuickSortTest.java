package code401.challenges.quickSort;

import code401.challenges.mergeSort.MergeSort;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {
    @Test
    public void quickHappyTest() {
        QuickSort classUnderTest = new QuickSort();
        int[] arr =  {5, 7, 2, 8, 1, 3};
        int[] expectedOutput = {1, 2, 3, 5, 7, 8};
        classUnderTest.quickSortFunc(arr, 0, arr.length-1);
        assertArrayEquals("Arrays should be equal", expectedOutput, arr);
    }

    @Test
    public void quickEdgeCase() {
        QuickSort classUnderTest = new QuickSort();
        int[] arr = {-5, -2, -100, -10, -1};
        int[] expectedOutput = {-100, -10, -5, -2, -1};
        classUnderTest.quickSortFunc(arr, 0, arr.length-1);
        assertArrayEquals("Arrays should be equal", expectedOutput, arr);
    }

    @Test
    public void quickEmptyArray() {
        QuickSort classUnderTest = new QuickSort();
        int[] arr = {};
        int[] expectedOutput = {};
        classUnderTest.quickSortFunc(arr, 0, arr.length-1);
        assertArrayEquals("Arrays should be equal", expectedOutput, arr);
    }
}