package code401.challenges.tree;

public class Node<T> {
    T value;
    Node<T> left;
    Node<T> right;

    //Default constructor
    public Node(){
        value = null;
        left = null;
        right = null;
    }

    public Node(T value){
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLeft() {
        return this.left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return this.right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

}
