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
    public int insertAfter(int value, int newVal){
        if(this.head == null) {
            System.out.println("Error, the list is empty");
            return -1;
        }else{
            Node current = this.head;
            Node newValue = new Node();
            newValue.value = newVal;
            while(current != null){
                if(current.value == value){
                    newValue.next = current.next;
                    current.next = newValue;
                    this.size++;
                    return 0;
                }else{
                    current = current.next;
                }
            }
        }
        System.out.println("The linked list does not contain "+ value);
        return -1;
    }

//
//    public static void main (String[] args){
//        LinkedList list = new LinkedList();
//        list.insert(4);
//        list.insert(3);
//        list.insert(2);
//        list.insert(1);
//        list.append(5);
//        list.append(6);
//        list.insertAfter(7, 0);
//        System.out.println(Arrays.toString(list.print()));
//    }

}
