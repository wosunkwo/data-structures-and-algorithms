package code401.challenges.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;

public class LinkedList {
    Node head;
    int size;

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
    }
}
