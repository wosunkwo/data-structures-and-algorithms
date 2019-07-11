package code401.challenges.treeIntersection;

import code401.challenges.tree.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeIntersectionTest {
    TreeIntersection classUnderTest = new TreeIntersection();
    @Test
    public void happyPath(){

        //Initializing my first tree
        Node<Integer> root1 = new Node(150);
        root1.setLeft(new Node(100));
        root1.setRight(new Node(250));
        root1.getLeft().setLeft(new Node(75));
        root1.getLeft().setRight(new Node(160));
        root1.getLeft().getRight().setLeft(new Node(125));
        root1.getLeft().getRight().setRight(new Node(175));
        root1.getRight().setRight(new Node(350));
        root1.getRight().setLeft(new Node(200));
        root1.getRight().getRight().setLeft(new Node(300));
        root1.getRight().getRight().setRight(new Node(500));

        //Initializing my second tree
        Node<Integer> root2 = new Node(42);
        root2.setLeft(new Node(100));
        root2.setRight(new Node(600));
        root2.getLeft().setLeft(new Node(15));
        root2.getLeft().setRight(new Node(160));
        root2.getLeft().getRight().setLeft(new Node(125));
        root2.getLeft().getRight().setRight(new Node(175));
        root2.getRight().setRight(new Node(350));
        root2.getRight().setLeft(new Node(200));
        root2.getRight().getRight().setLeft(new Node(4));
        root2.getRight().getRight().setRight(new Node(500));

        String expectedOutput = "[100, 160, 125, 175, 200, 350, 500]";

        assertEquals("This should return true if the duplicate valiues are the same", expectedOutput, classUnderTest.tree_intersection(root1, root2).toString() );
    }

    @Test
    public void failPath(){
        Node<Integer> root1 = new Node<>();
        Node<Integer> root2 = new Node<>();
        String expectedOutput = "[null]";

        assertEquals("This should return an empty list because my trees dont have any values in them", expectedOutput, classUnderTest.tree_intersection(root1,root2).toString());
    }

    @Test
    public void edgeCase(){
        //Initializing my first tree
        Node<Integer> root1 = new Node(150);
        root1.setLeft(new Node(100));
        root1.setRight(new Node(250));
        root1.getLeft().setLeft(new Node(75));
        root1.getLeft().setRight(new Node(160));

        //Initializing my second tree
        Node<Integer> root2 = new Node(42);
        root2.setLeft(new Node(100));
        root2.setRight(new Node(600));
        root2.getLeft().setLeft(new Node(15));
        String expectedOutput = "[100]";

        assertEquals("This should return true if the function returns the right duplicate integers", expectedOutput, classUnderTest.tree_intersection(root1,root2).toString());
    }

}