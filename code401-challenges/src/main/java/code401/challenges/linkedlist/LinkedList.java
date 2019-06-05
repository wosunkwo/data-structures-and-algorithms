package code401.challenges.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;

public class LinkedList {
    Node head;
    int size; //stores the size of the linked list

    LinkedList() {
        //upon instantiation the head will point to null
        this.head = null;
        size = 0;
    }

    //function to insert a new node into the front of the linked list
    public void insert(int value) {
        try{
            Node current = new Node();
            current.value = value;
            if (this.head == null) {
                head = current;
                current.next = null;
            } else {
                current.next = head;
                head = current;
            }
            size += 1;
        }catch (IndexOutOfBoundsException e){
            System.out.println("The index your are trying to access is out of bounds");
        }
    }

    //function to to check if our linked list contains a value
    public boolean includes(int value) {
        if (this.head == null) {
            return false;
        } else {
            Node current = head;
            while (current != null) {
                if (current.value == value) {
                    return true;
                } else {
                    current = current.next;
                }
            }
        }
        return false;
    }

    //function that returns a collection of all the values in our linked list
    public int[] print() {
        try {
            if (this.head == null) {
                return null;
            }
            int[] resultArr = new int[size];
            Node current = head;
            int arrCnt = 0;
            while (current != null) {
                resultArr[arrCnt] = current.value;
                current = current.next;
                arrCnt++;
            }
            return resultArr;

        } catch (IndexOutOfBoundsException e) {
            System.out.println("The index your are trying to access is out of bounds");
            return null;
        }
    }


    //This function adds a new value to the end of the linked list
    public void append(int value){
        Node current = new Node();
        current.value = value;
        current.next = null;
        if(this.head == null){
            this.head = current;
        }else{
            Node iterator = this.head;
            while(iterator.next != null){
                iterator = iterator.next;
            }
            iterator.next = current;
        }
        this.size++;
    }

    //this function adds a new value at the back of the specified value
    public int insertBefore(int value, int newVal){
        if(this.head == null){
            System.out.println("Error, the list is empty");
            return -1;
        }else if(this.head.value == value) {
                Node newValue = new Node();
                newValue.value = newVal;
                newValue.next = this.head;
                this.head = newValue;
                this.size++;
                return 0;
        }else{
            Node current = head.next;
            Node previous = head;
            Node newValue = new Node();
            newValue.value = newVal;
            while(current != null){
                if(current.value == value){
                    previous.next = newValue;
                    newValue.next = current;
                    this.size++;
                    return 0;
                }else{
                    previous = current;
                    current = current.next;
                }
            }
        }
        System.out.println("The linked list does not contain "+ value);
        return -1;
    }

    //this function adds a new value in front of a specified value
    public void insertAfter(int value, int newVal){
        if(this.head == null) {
            System.out.println("Error, the list is empty");
            return;
        }else{
            Node current = this.head;
            Node newValue = new Node();
            newValue.value = newVal;
            while(current != null){
                if(current.value == value){
                    newValue.next = current.next;
                    current.next = newValue;
                    this.size++;
                    return;
                }else{
                    current = current.next;
                }
            }
        }
        System.out.println("The linked list does not contain "+ value);
        return;
    }

    public int knthFromEnd(int value){
        if(this.head == null){
            throw new NullPointerException("The Linked list is empty");
        }else if(value > this.size){
            throw new IllegalArgumentException("The value you passed is greater than the size of the linked list. Please try a different value");
        }else if (value == this.size){
               throw new IllegalArgumentException("The value you passed is the same as the size of the linked list");
        }else if(value < 0) {
            throw new IllegalArgumentException("You passed in a negative value");
        }else{
            //the kIndex represents the difference between the size of the linked list and the k index. I.E it represents the index of the value we are going to be returning
            int kIndex = this.size - value;
            int listCounter = 1;
            Node current = this.head;

            while(current != null){
                if(kIndex == listCounter){
                    return current.value;
                }else{
                    current = current.next;
                    listCounter++;
                }
            }
        }
        return -1;
    }


    public static void main (String[] args){
        LinkedList test = new LinkedList();
        test.append(1);
        test.append(3);
        test.append(8);
        test.append(2);

        System.out.println(test.knthFromEnd(1));
    }
}
