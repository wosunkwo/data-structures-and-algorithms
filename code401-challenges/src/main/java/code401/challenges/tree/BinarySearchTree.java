package code401.challenges.tree;

import code401.challenges.BinarySearch;

public class BinarySearchTree {
    Node<Integer> root;

    public BinarySearchTree(){
        root = null;
    }

    public BinarySearchTree(Node<Integer> head){
        root = head;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> root) {
        this.root = root;
    }

    public void add(Integer value){
        Node<Integer> temp = new Node<>();
        temp.setValue(value);
            if(root == null){
                setRoot(temp);
            }else{
                Node<Integer> iterator = root;
                while(iterator.getLeft() != null && iterator.getRight() != null){
                    if(value < iterator.getValue()){
                        iterator = iterator.getLeft();
                    }else if(value > iterator.getValue()){
                        iterator = iterator.getRight();
                    }else{
                        System.out.println("You cannot add duplicate values to the tree");
                        break;
                    }
                }
               if(iterator.getLeft() == null){
                 iterator.setLeft(temp);
               }else{
                   iterator.setRight(temp);
               }
            }
    }

    public boolean contains(Integer value){
        if(root == null)
            return false;
        Node<Integer> temp = root;
        while(temp != null){
            if(temp.getValue() == value)
                return true;
            if(value > temp.getValue()){
                temp = temp.getRight();
            }else if(value < temp.getValue()){
                temp = temp.getLeft();
            }
        }
        return false;
    }
}
