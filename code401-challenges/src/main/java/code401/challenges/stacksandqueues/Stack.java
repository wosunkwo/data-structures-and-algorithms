package code401.challenges.stacksandqueues;


public class Stack <T>{
    Node top;

    public Node getTop() {
        return top;
    }

    public Stack(){
        this.top = null;
    }

    //method to add a new node to the top of the stack
    public void push(T value){
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
    public T pop(){
        try{
            T value;
            if(top.getNext() == null){
                value = (T) top.getValue();
                top = null;
                return value;
            }else{
                value = (T) top.getValue();
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
    public T peek(){
        try{
            return (T) top.getValue();
        }catch(NullPointerException e){
            System.out.println("The stack is empty. No value to peek");
            System.out.println(e);
            return null;
        }
    }
}
