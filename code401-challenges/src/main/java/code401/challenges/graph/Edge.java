package code401.challenges.graph;

public class Edge {
    private Integer weight;
    private Node leftNode;
    private Node rightNode;

    Edge(){
        this.weight = null;
        this.leftNode = new Node();
        this.rightNode = new Node();
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }
}
