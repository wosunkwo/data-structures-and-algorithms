package code401.challenges.hashtable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {
    Hashtable classUnderTest = new Hashtable<String>(1024);

    @Test
    public void addOneKey(){
        classUnderTest.add("williams", "seattle living");
        String expectedResult = "seattle living";
        assertEquals("This should be true if the key is successfully added to the data structure", expectedResult, classUnderTest.get("williams"));
    }

    @Test
    public void keyDoesntExist(){
        classUnderTest.add("williams", "seattle living");
        assertNull("should return null if the key doesnt exist in the hash table" ,classUnderTest.get("wrong key"));
    }

    @Test
    public void handleCollision(){
        //these two values will cause a collision
        classUnderTest.add("jamiu", "seattle living");
        classUnderTest.add("YYYYYY", "seattle living");
        String expectedOutput = "seattle living";
        assertEquals("This shsould return true if the btoh strings are the same", expectedOutput, classUnderTest.get("jamiu"));
        assertEquals("This shsould return true if the btoh strings are the same", expectedOutput, classUnderTest.get("YYYYYY"));

    }


}