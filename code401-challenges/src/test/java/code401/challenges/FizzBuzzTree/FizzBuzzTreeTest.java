package code401.challenges.FizzBuzzTree;

import code401.challenges.tree.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {
    FizzBuzzTree classUnderTest = new FizzBuzzTree();
    Node<String> root = new Node<String>("3");

    @Test
    public void happyPath(){
        String expectedOutput = "Fizz";
        assertEquals("Should return true if the two strings are the same", expectedOutput, classUnderTest.fizzbuzz(root).getValue());
    }

    @Test
    public void sadPath(){
        String expectedOutput = "Buzz";
        assertNotEquals("Should return true if the two strings are not the same", expectedOutput, classUnderTest.fizzbuzz(root).getValue());
    }

    @Test
    public void edgePath(){
        Node<String> rootR =new Node<String>("15");
        root.setRight(rootR);
        String expectedOutput = "FizzBuzz";
        assertEquals("Should return true if the two strings are the same", expectedOutput, classUnderTest.fizzbuzz(root).getRight().getValue());
    }

}
