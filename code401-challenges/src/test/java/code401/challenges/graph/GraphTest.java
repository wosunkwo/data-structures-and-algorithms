package code401.challenges.graph;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.*;

public class GraphTest {
    Graph graph = new Graph();
    Node testNode1;
    Node testNode2;
    Node testNode3;
    Node testNode4;


    @Before
    public void initializeSomeNodes(){
        testNode1 = new Node();
        testNode1.setValue(1);

        testNode2 = new Node();
        testNode2.setValue(2);

        testNode3 = new Node();
        testNode3.setValue(3);

        testNode4 = new Node();
        testNode4.setValue(4);

        graph.addNode(testNode1);
        graph.addNode(testNode2);
        graph.addNode(testNode3);
        graph.addNode(testNode4);

        graph.addEdge(testNode1, testNode2, 10);
        graph.addEdge(testNode1, testNode3, 20);
        graph.addEdge(testNode2, testNode3, 30);
        graph.addEdge(testNode2, testNode4, 40);

    }

    //test to see if i can successfully add a node to my graph
    @Test
    public void nodeCanBeAdded(){
        Node testNode = new Node();
        testNode.setValue(1);
        assertEquals("This should be true if the node can be successfully added to the graph",testNode, graph.addNode(testNode));
    }

    //test to see if i can successfully add an edge to two nodes in my graph
    @Test
    public void edgeCanBeAdded(){
        assertTrue("This should return true if the edge was succesfully added to my graph", graph.addEdge(testNode1,testNode2,10));
    }

    //test if i can successfully retrieve a collection of all the nodes in my graph
    @Test
    public void collectionCanBeRetrieved(){
        HashSet<Node> expectedOutput = new HashSet<>();
        expectedOutput.add(testNode1);
        expectedOutput.add(testNode2);
        expectedOutput.add(testNode3);
        expectedOutput.add(testNode4);
        assertEquals("This should return true if i am able to successfully retrive all my nodes in the graph", expectedOutput, graph.getNodes());
    }

    @Test
    public void retriveAllNeigbours(){
        Integer[] expectedOutput = new Integer[3];
        expectedOutput[0] = 30;
        expectedOutput[1] = 40;
        expectedOutput[2] = 10;

       Integer[] retrievedOutput = new Integer[3];
       int cnt = 0;

       for(Map.Entry<Node, Integer> entry: graph.getNeighbors(testNode2).entrySet()){
           retrievedOutput[cnt] = entry.getValue();
           cnt++;
       }

       assertArrayEquals("This should return true if the neighbours of my node are correct", expectedOutput, retrievedOutput);
    }

    //test to make sure jy size() method returns the correct size of ny graph
    @Test
    public void properSizeReturned(){
        int expectedOutput = 4;
        assertEquals("This should be true if the correct size of my graph is returned", expectedOutput, graph.size());
    }

    @Test
    public void emptyGraphReturnsNull(){
        Graph emptyGraph = new Graph();
        assertNull("This should return null if the graph is empty", emptyGraph.getNeighbors(testNode1));
    }

}