package code401.challenges.graph;

import java.util.*;

public class Graph {
    HashSet<Node> nodes;

    Graph(){
        this.nodes = new HashSet<>();
    }

    //function to add a new node to the graph. Returns the new node added if it doesnt already exist in the graph
    //or returns null if the node is a duplicate
    public Node addNode(Node newNode){
        if (this.nodes.add(newNode) == true){
            return newNode;
        }else{
            return null;
        }
    }

    ///function to add an edge in-between two nodes, returns true if the edge was successfully added,
    // returns false if it wasn't
    public boolean addEdge(Node leftNode, Node rightNode, int weight){
        if(this.nodes.contains(leftNode) == true && this.nodes.contains(rightNode) == true){
            Edge newEdge = new Edge();
            newEdge.setWeight(weight);
            newEdge.setLeftNode(leftNode);
            newEdge.setRightNode(rightNode);
            leftNode.getEdges().add(newEdge);
            rightNode.getEdges().add(newEdge);
            return true;
        }
        return false;
    }

    //method to return all of the nodes in our map. It returns them in form of an arrayList
    public ArrayList<Node> getNodes(){
        ArrayList<Node> allNodes = new ArrayList<>();
        Iterator<Node> it = this.nodes.iterator();
        while(it.hasNext()){
            allNodes.add(it.next());
        }
        return allNodes;
    }

    //method to return all the neighbours of a node in our map, and the weight of all the connected edges
    //it returns them as a Hashmap
    public HashMap<Node, Integer> getNeighbors(Node currentNode){
        if(this.nodes.contains(currentNode)){
            HashMap<Node, Integer> resultMap = new HashMap<>();
            Iterator<Edge> currentNodeEdges = currentNode.getEdges().iterator();
            Integer weight;
            Node neighbor;
            while(currentNodeEdges.hasNext()){
                Edge currentEdge = currentNodeEdges.next();
                weight = currentEdge.getWeight();
                if(currentEdge.getLeftNode() != currentNode){
                    neighbor = currentEdge.getLeftNode();
                }else{
                    neighbor = currentEdge.getRightNode();
                }
                resultMap.put(neighbor, weight);
            }
            return resultMap;
        }
        return null;
    }

//returns the number of nodes in the graph
    public int size(){
        return this.nodes.size();
    }

    public static void main(String[] args){
        Graph graph = new Graph();

        Node temp1 = new Node();
        temp1.setValue(1);

        Node temp2 = new Node();
        temp2.setValue(2);

        Node temp3 = new Node();
        temp3.setValue(3);

        Node temp4 = new Node();
        temp4.setValue(4);

        graph.addNode(temp1);
        graph.addNode(temp2);
        graph.addNode(temp3);
        graph.addNode(temp4);

        graph.addEdge(temp1, temp2,10);
        graph.addEdge(temp1, temp3,20);
        graph.addEdge(temp2, temp3,30);
        graph.addEdge(temp2, temp4,40);

        for(Map.Entry<Node, Integer> entry: graph.getNeighbors(temp4).entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
