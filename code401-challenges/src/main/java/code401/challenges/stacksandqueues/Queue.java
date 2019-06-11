package code401.challenges.stacksandqueues;

import code401.challenges.linkedlist.Node;

import java.util.EmptyStackException;

public class Queue {
    Node front;
    Node back;

    public Queue(){
        this.front = null;
        this.back = null;
    }

    //method to add a new node to the back of the queue
    public void enqueue(int value){
        Node current = new Node();
        current.setValue(value);
        if(front == null){
            back = current;
            front = back;
            front.setNext(null);
        }else if(front.getNext() == null){
            back = current;
            front.setNext(back);
            back.setNext(null);
        }else{
            back.setNext(current);
            back = current;
        }
    }

    //method to remove a node from the front of the queue
    public Integer dequeue(){
        try{
            Integer tempValue = front.getValue();
            Node tempNext = front.getNext();
            front.setNext(null);
            front = tempNext;
            return tempValue;

        }catch(NullPointerException e){
            System.out.println("The queue is empty. Nothing to dequeue");
            System.out.println(e);
            return null;
        }
    }

//method to view the node at the front of the queue
    public Integer peek(){
        try{
            return front.getValue();

        }catch(NullPointerException e){
            System.out.println("The queue is empty. Nothing to peek");
            System.out.println(e);
            return null;
        }
    }

    public static void main(String[] args){
        Queue temp = new Queue();
        temp.enqueue(10);
        temp.enqueue(15);
        temp.dequeue();
        temp.dequeue();
        System.out.println(temp.back.getValue());
    }

}
