package code401.challenges.graph;

public class Edge {
    private Integer weight;
    private Integer price;
    private Node leftNode;
    private Node rightNode;

    public Edge(){
        this.weight = null;
        this.price = null;
        this.leftNode = new Node();
        this.rightNode = new Node();
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
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
