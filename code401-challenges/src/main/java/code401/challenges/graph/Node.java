package code401.challenges.graph;

import java.util.HashSet;

public class Node {
    private Integer value;
    private String city;
    HashSet<Edge> edges;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Node(){
        this.value = null;
        this.city = null;
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
