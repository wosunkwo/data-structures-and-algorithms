package code401.challenges.stacksandqueues;

import code401.challenges.linkedlist.Node;

public class Stack {
    Node top;

    public Stack(){
        this.top = null;
    }

    //method to add a new node to the top of the stack
    public void push(int value){
        Node current = new Node();
        current.setValue(value);
        if(top == null){
            current.setNext(null);
            top = current;
        }else{
            current.setNext(top);
            top = current;
        }
    }

    //method to remove a node from the top of the stack
    public Integer pop(){
        try{
            int value;
            if(top.getNext() == null){
                value = top.getValue();
                top = null;
                return value;
            }else{
                value = top.getValue();
                Node temp = top.getNext();
                top.setNext(null);
                top = temp;
                return value;
            }
        }catch(NullPointerException e){
            System.out.println("The stack is empty. No value to remove");
            System.out.println(e);
            return null;
        }
    }

    //method to view the value at the top of the stack without removing that value
    public Integer peek(){
        try{
            return top.getValue();
        }catch(NullPointerException e){
            System.out.println("The stack is empty. No value to peek");
            System.out.println(e);
            return null;
        }
    }

}
