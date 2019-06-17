package code401.challenges.tree;


import code401.challenges.BinarySearch;

import java.util.ArrayList;

public class BinaryTree<T> {

    Node<T> root;

    public BinaryTree(){
        root = null;
    }

    public BinaryTree(Node<T> head){
        root = head;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public Node<T> getRoot() {
        return root;
    }

    public ArrayList<T> preOrder(Node<T> node){
        ArrayList<T> resultArr = new ArrayList<>();
        preOrderHelper(node, resultArr);
        return resultArr;
    }

    public ArrayList<T> inOrder(Node<T> node){
        ArrayList<T> resultArr = new ArrayList<>();
        inOrderHelper(node, resultArr);
        return resultArr;
    }

    public ArrayList<T> postOrder(Node<T> node){
        ArrayList<T> resultArr = new ArrayList<>();
        postOrderHelper(node, resultArr);
        return resultArr;
    }

    public void preOrderHelper(Node<T> node, ArrayList<T> resultArr){
        try{
            if(node == null){
                return;
            }else{
                resultArr.add(node.getValue());
                preOrderHelper(node.getLeft(), resultArr);
                preOrderHelper(node.getRight(), resultArr);
            }
        }catch(NullPointerException e){
            System.out.println("The root is null");
            System.out.println(e);
        }
    }


    public void inOrderHelper(Node<T> node, ArrayList<T> resultArr){
        try{
            if(node == null){
                return;
            }else{
                preOrderHelper(node.getLeft(), resultArr);
                resultArr.add(node.getValue());
                preOrderHelper(node.getRight(), resultArr);
            }
        }catch(NullPointerException e){
            System.out.println("The root is null");
            System.out.println(e);
        }
    }


    public void postOrderHelper(Node<T> node, ArrayList<T> resultArr){
        try{
            if(node == null){
                return;
            }else{
                preOrderHelper(node.getLeft(), resultArr);
                preOrderHelper(node.getRight(), resultArr);
                resultArr.add(node.getValue());
            }
        }catch(NullPointerException e){
            System.out.println("The root is null");
            System.out.println(e);
        }
    }

    public static void main (String[] args){
        BinaryTree<Integer> tree = new BinaryTree<>();
        Node<Integer> root = new Node<>(1);
        Node<Integer> treeL = new Node<>(2);
        Node<Integer> treeR = new Node<>(5);
        Node<Integer> treeLL = new Node<>(3);
        Node<Integer> treeLR = new Node<>(4);
        Node<Integer> treeRR = new Node<>(6);

        treeL.setLeft(treeLL);
        treeL.setRight(treeLR);
        treeR.setRight(treeRR);
        root.setRight(treeR);
        root.setLeft(treeL);

        System.out.println(tree.postOrder(root).toString());
    }

}


