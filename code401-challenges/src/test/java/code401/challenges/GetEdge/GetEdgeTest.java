package code401.challenges.GetEdge;

import code401.challenges.graph.Graph;
import code401.challenges.graph.Node;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetEdgeTest {
    Graph graph;
    GetEdge classUnderTest;


    @Before
    public void initializer(){
        graph = new Graph();
        classUnderTest = new GetEdge();

        Node lagos = new Node();
        lagos.setCity("lagos");

        Node texas = new Node();
        texas.setCity("texas");

        Node seattle = new Node();
        seattle.setCity("seattle");

        Node abuja = new Node();
        abuja.setCity("abuja");

        graph.addNode(lagos);
        graph.addNode(texas);
        graph.addNode(seattle);
        graph.addNode(abuja);

        graph.addEdge(lagos, abuja,10, 100);
        graph.addEdge(texas, seattle,20, 200);
        graph.addEdge(lagos, texas,30, 300);
        graph.addEdge(lagos, seattle,40, 400);
    }
    @Test
    public void happyPath(){
        String[] arr = new String[2];
        arr[0] = "lagos";
        arr[1] = "abuja";
        Boolean tripPossible = true;
        int price = 100;

        GetEdge.Result expectedOutput = classUnderTest.tripEstimate(graph, arr);

        assertEquals("This should return true if the trip is possible", tripPossible, expectedOutput.tripPossible);
        assertEquals("This should return true if the trip price adds up", price, expectedOutput.price);
    }

    @Test
    public void happyPath2(){
        String[] arr = new String[2];
        arr[0] = "abuja";
        arr[1] = "seattle";
        Boolean tripPossible = false;
        int price = 0;

        GetEdge.Result expectedOutput = classUnderTest.tripEstimate(graph, arr);

        assertEquals("This should return true if the trip is possible", tripPossible, expectedOutput.tripPossible);
        assertEquals("This should return true if the trip price adds up", price, expectedOutput.price);
    }

    @Test
    public void edgePath(){
        String[] arr = new String[3];
        arr[0] = "abuja";
        arr[1] = "lagos";
        arr[2] = "texas";
        Boolean tripPossible = true;
        int price = 400;

        GetEdge.Result expectedOutput = classUnderTest.tripEstimate(graph, arr);

        assertEquals("This shoiuld return true if the trip is possible", tripPossible, expectedOutput.tripPossible);
        assertEquals("This should return true if the trip price adds up", price, expectedOutput.price);
    }

    @Test
    public void failPath(){
        String[] arr = new String[1];
        arr[0] = "abuja";

        GetEdge.Result expectedOutput = classUnderTest.tripEstimate(graph, arr);

        assertNull("This should be true if the method returns null for an array that only has one element in it", expectedOutput);
    }



}