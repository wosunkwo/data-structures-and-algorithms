package code401.challenges.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    BinarySearchTree classUnderTest;
    Node<Integer> root;
    @Before
    public void testInstantiateClass(){
        classUnderTest = new BinarySearchTree();
    }

    @Test
    public void testInstantiateEmptyTree(){
        assertNull("This should return true if the tree is empty/null ", classUnderTest.getRoot());
    }

    @Test
    public void testSingleRootNodeTree(){
        classUnderTest.add(1);
        assertTrue("This should return true if the tree contains a node ",classUnderTest.contains(1));
    }

    @Test
    public void testLeftRightRootNodeTree(){
        classUnderTest.add(1);
        classUnderTest.add(2);
        classUnderTest.add(3);
        assertTrue("This should return true if the tree is not empty", classUnderTest.contains(3));
    }

    @Test
    public void testFalseLeftRightRootNodeTree(){
        classUnderTest.add(1);
        classUnderTest.add(2);
        classUnderTest.add(3);
        assertFalse("This should return true if the tree does not contain the number", classUnderTest.contains(5));
    }
}