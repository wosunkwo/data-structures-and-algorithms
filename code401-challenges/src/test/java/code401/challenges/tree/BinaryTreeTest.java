package code401.challenges.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    BinaryTree<Integer> classUnderTest;
    Node<Integer> root;
    @Before
    public void testInstantiateClass(){
        classUnderTest = new BinaryTree<>();
        root = new Node<>(1);
        Node<Integer> treeL = new Node<>(2);
        Node<Integer> treeR = new Node<>(5);
        root.setLeft(treeL);
        root.setRight(treeR);
    }

    @Test
    public void testInstantiateEmptyTree(){
        assertNull("This should return true if the tree is empty/null ", classUnderTest.getRoot());
    }

    @Test
    public void testSingleRootNodeTree(){
        classUnderTest.setRoot(root);
        Integer resultInt = 1;
        assertEquals("This should return true if the tree contains a node ", resultInt ,classUnderTest.root.getValue());
    }

    @Test
    public void testLeftRightRootNodeTree(){
        classUnderTest.setRoot(root);
        assertNotNull("This should return true if the tree is not empty", classUnderTest.getRoot());
    }


    @Test
    public void testInOrderTree(){
        classUnderTest.setRoot(root);
        ArrayList<Integer> resultArr = new ArrayList<>();
        resultArr.add(2);
        resultArr.add(1);
        resultArr.add(5);

        assertEquals("This should return true if both arrays are equal ", resultArr ,classUnderTest.inOrder(root));
    }

    @Test
    public void testPreOrderTree(){
        classUnderTest.setRoot(root);
        ArrayList<Integer> resultArr = new ArrayList<>();
        resultArr.add(1);
        resultArr.add(2);
        resultArr.add(5);

        assertEquals("This should return true if both arrays are equal ", resultArr ,classUnderTest.preOrder(root));
    }

    @Test
    public void testPostOrderTree(){
        classUnderTest.setRoot(root);
        ArrayList<Integer> resultArr = new ArrayList<>();
        resultArr.add(2);
        resultArr.add(5);
        resultArr.add(1);

        assertEquals("This should return true if both arrays are equal ", resultArr ,classUnderTest.postOrder(root));
    }

}