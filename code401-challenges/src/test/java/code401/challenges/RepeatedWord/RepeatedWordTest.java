package code401.challenges.RepeatedWord;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {
    RepeatedWord classUnderTest = new RepeatedWord();
    @Test
    public void happyPath(){
        String testSentence = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of " +
                "belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter" +
                " of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way" +
                " – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or" +
                " for evil, in the superlative degree of comparison only...";
        String expectedOutput = "it";
        assertEquals("This should return true if both strings are the same", expectedOutput,classUnderTest.occurMoreThanOnce(testSentence));
    }

    @Test
    public void happyPath2(){
        String testSentence = "Once upon a time, there was a brave princess who...";
        String expectedOutput = "a";
        assertEquals("This should return true if both strings are the same", expectedOutput,classUnderTest.occurMoreThanOnce(testSentence));
    }

    @Test
    public void happyPath3(){
        String testSentence = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        String expectedOutput = "summer";
        assertEquals("This should return true if both strings are the same", expectedOutput,classUnderTest.occurMoreThanOnce(testSentence));
    }

    @Test
    public void edgePath(){
        String testSentence = "It";
        assertNull("This should return true if the function returns null", classUnderTest.occurMoreThanOnce(testSentence));
    }

    @Test
    public void failPath(){
        String testSentence = "this is a sentence that does not have duplicate words";
        assertNull("This should return true if the function returns null", classUnderTest.occurMoreThanOnce(testSentence));
    }


}