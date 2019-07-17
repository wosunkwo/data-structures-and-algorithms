package code401.challenges.GetEdge;

import code401.challenges.graph.Edge;
import code401.challenges.graph.Graph;
import code401.challenges.graph.Node;

import java.util.Iterator;

public class GetEdge {

    public class Result {
        public Boolean tripPossible;
        public int price;
        public Result(){
            tripPossible = false;
            price = 0;
        }
    }

    public Result tripEstimate(Graph graph, String[] cityNames){
        if(cityNames.length <= 1){
            return null;
        }else{
            String startCity = cityNames[0];
            Iterator<Node> it = graph.getNodes().iterator();
            Node startNode = new Node();
            Result result = new Result();
            int recordTrip = 1;

            //finding where the start node is in our graph
            while(it.hasNext()){
                Node currentNode = it.next();
                if(currentNode.getCity().equals(startCity)){
                    startNode = currentNode;
                }
            }

            for(int i=1; i < cityNames.length; i++){
                Iterator<Edge> edgeIterator = startNode.getEdges().iterator();
                while(edgeIterator.hasNext()){
                    Edge currentEdge = edgeIterator.next();
                    if(currentEdge.getRightNode().getCity().equals(cityNames[i])){
                        result.price += currentEdge.getPrice();
                        recordTrip++;
                        startNode = currentEdge.getRightNode();
                    }else if(currentEdge.getLeftNode().getCity().equals(cityNames[i])){
                        result.price += currentEdge.getPrice();
                        recordTrip++;
                        startNode = currentEdge.getLeftNode();
                    }
                }
            }
            if(recordTrip == cityNames.length){
                result.tripPossible = true;
            }else{
                result.price = 0;
            }
            return result;
        }
    }
}
