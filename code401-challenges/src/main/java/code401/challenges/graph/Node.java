package code401.challenges.graph;

import java.util.HashSet;

public class Node {
    private Integer value;
    HashSet<Edge> edges;
    Node(){
        this.value = null;
        this.edges = new HashSet<>();
    }
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public HashSet<Edge> getEdges() {
        return edges;
    }

    public void setEdges(HashSet<Edge> edges) {
        this.edges = edges;
    }
}
