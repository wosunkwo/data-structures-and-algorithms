package code401.challenges.stacksandqueues;

public class Node <T> {
    T value;
    Node next;
    int timeStamp;

    public Node (){
        this.value = null;
        this.next = null;
        timeStamp = 0;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
    }
}
