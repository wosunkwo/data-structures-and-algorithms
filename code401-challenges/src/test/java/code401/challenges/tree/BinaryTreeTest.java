package code401.challenges.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    BinaryTree classUnderTest;
    Node<Integer> root;
    @Before
    public void testInstantiateClass(){
        classUnderTest = new BinaryTree();
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

    @Test
    public void BreadthFirstHappy(){
        BinaryTree tree = new BinaryTree();
        tree.root= new Node(1);
        tree.root.left= new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left= new Node(4);
        tree.root.left.right= new Node(5);

        String resultStr = "1 2 3 4 5 ";

        assertEquals("This should return true if both strings are equal ", resultStr, tree.breadthFirst());
    }

    @Test
    public void BreadthFirstEdge(){
        BinaryTree tree = new BinaryTree();
        tree.root= new Node(2);
        tree.root.left= new Node(7);
        tree.root.right= new Node(5);
        tree.root.left.left= new Node(2);
        tree.root.left.right= new Node(6);
        tree.root.left.right.left= new Node(5);
        tree.root.left.right.right= new Node(11);
        tree.root.right.right= new Node(9);
        tree.root.right.right.left= new Node(4);

        String resultStr = "2 7 5 2 6 9 5 11 4 ";

        assertEquals("This should return true if both strings are equal ", resultStr, tree.breadthFirst());
    }

    @Test
    public void BreadthFirstSad(){
        BinaryTree tree = new BinaryTree();
        assertNull("This should return true if the tree is empty are equal ", tree.breadthFirst());
    }

    @Test
    public void maxValueHappy(){
        classUnderTest.setRoot(root);
        Integer expectedOutput = 5;
        assertEquals("This should return true if the maximum value in the tree is the same as the expected output ", expectedOutput,  classUnderTest.find_maximum_value(classUnderTest.getRoot()));
    }

    @Test
    public void maxValueEdge(){
        Node<Integer> root = new Node(2);
        root.setLeft(new Node(7));
        root.setRight(new Node(5));
        root.getLeft().setRight(new Node(6));
        root.getLeft().getRight().setLeft(new Node(1));
        root.getRight().setRight(new Node(11));
        root.getRight().setLeft(new Node(4));
        root.getRight().getRight().setLeft(new Node(9));

        BinaryTree tree = new BinaryTree(root);

        Integer expectedOutput = 11;
        assertEquals("This should return true if the maximum value in the tree is the same as the expected output ", expectedOutput,  classUnderTest.find_maximum_value(tree.getRoot()));
    }

    @Test
    public void maxValueSad(){
        BinaryTree tree = new BinaryTree();

        Integer expectedOutput = Integer.MIN_VALUE;
        assertEquals("This should return true if the maximum value in the tree is the same as the expected output ", expectedOutput,  tree.find_maximum_value(tree.getRoot()));
    }

}