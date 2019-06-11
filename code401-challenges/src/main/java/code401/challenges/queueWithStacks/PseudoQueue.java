package code401.challenges.queueWithStacks;

import code401.challenges.stacksandqueues.Stack;

public class PseudoQueue {
    Stack mainStack;
    Stack tempStack;

    public PseudoQueue(){
        mainStack = new Stack();
        tempStack = new Stack();;
    }

    //method to add a new value to the back queue
    public void enqueue(int value){
        if(mainStack.getTop() == null){
            mainStack.push(value);
        }else{
            while(mainStack.getTop() != null){
                tempStack.push(mainStack.pop());
            }
            mainStack.push(value);
            while(tempStack.getTop() != null){
                mainStack.push(tempStack.pop());
            }
        }
    }

    //method to remove a value from the front of the queue
    public Integer dequeue(){
        try{
           Integer value = mainStack.pop();
           return value;
        }catch(NullPointerException e){
            System.out.println("The queue is empty. There is nothing to remove");
            System.out.println(e);
            return null;
        }
    }

    public static void main(String[] args){
        PseudoQueue temp = new PseudoQueue();
        temp.enqueue(10);
        temp.enqueue(20);
        temp.enqueue(30);
        temp.dequeue();
        System.out.println(temp.dequeue());
        System.out.println(temp.dequeue());
    }

}
