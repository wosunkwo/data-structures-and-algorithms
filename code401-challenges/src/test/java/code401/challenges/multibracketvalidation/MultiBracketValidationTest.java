package code401.challenges.multibracketvalidation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    public MultiBracketValidation classUnderTest;
    @Before
    public void initializeClass(){
        classUnderTest = new MultiBracketValidation();
    }

    @Test
    public void testHappyPath(){
        assertTrue("This should return true if the method returns false", classUnderTest.multiBracketValidation("(text())"));
    }

    @Test
    public void testFalsePath(){
        assertFalse("This should return true if the method returns false", classUnderTest.multiBracketValidation("(]("));
    }

    @Test
    public void testEdgePath(){
        assertTrue("This should return true if the method returns true", classUnderTest.multiBracketValidation("{}{Code}[Fellows](())"));
    }
}