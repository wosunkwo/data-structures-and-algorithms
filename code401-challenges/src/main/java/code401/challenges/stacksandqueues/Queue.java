package code401.challenges.stacksandqueues;

public class Queue <T> {
    Node front;
    Node back;

    public Queue(){
        this.front = null;
        this.back = null;
    }

    //method to add a new node to the back of the queue
    public void enqueue(T value){
        Node <T> current = new <T> Node();
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

    //method to add a new node to the back of the queue with a timestamp
    public void enqueue(T value, int timeStamp){
        Node <T> current = new <T> Node();
        current.setValue(value);
        current.setTimeStamp(timeStamp);
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
    public T dequeue(){
        try{
            T tempValue = (T) front.getValue();
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
    public Node peek(){
        try{
            //return (T) front.getValue();
            return front;

        }catch(NullPointerException e){
            System.out.println("The queue is empty. Nothing to peek");
            System.out.println(e);
            return null;
        }
    }
}
