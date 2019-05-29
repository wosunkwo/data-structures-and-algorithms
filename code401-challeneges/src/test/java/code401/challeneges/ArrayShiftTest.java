package code401.challeneges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test
    public void testTheHappyPath() {
        ArrayShift classUnderTest = new ArrayShift();
        int[] arr = {4,8,15,23,42};
        int value  = 16;
        int[] expectedOutput = {4,8,15,16,23,42};
        assertArrayEquals("someLibraryMethod should return 'true'", expectedOutput, classUnderTest.insertShiftArray(arr, value));
    }
}
