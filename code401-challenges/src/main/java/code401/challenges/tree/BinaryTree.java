package code401.challenges.tree;

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

    int height(Node root)
    {
        if (root == null)
            return 0;
        else
        {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1);
        }
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
                inOrderHelper(node.getLeft(), resultArr);
                resultArr.add(node.getValue());
                inOrderHelper(node.getRight(), resultArr);
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
                postOrderHelper(node.getLeft(), resultArr);
                postOrderHelper(node.getRight(), resultArr);
                resultArr.add(node.getValue());
            }
        }catch(NullPointerException e){
            System.out.println("The root is null");
            System.out.println(e);
        }
    }


    public String breadthFirst(){
        int h = height(root);
        int i;
        if(root == null){
            return null;
        }
        else{
            StringBuilder resultStr = new StringBuilder();
            for (i=1; i<=h; i++)
                printGivenIndex(root, i, resultStr);
            return resultStr.toString();
        }
    }


    void printGivenIndex (Node root ,int currentLevel, StringBuilder resultStr)
    {
        if (root == null)
            return;
        if (currentLevel == 1){
            resultStr.append(root.value);
            resultStr.append(" ");
        }
        else if (currentLevel > 1)
        {
            printGivenIndex(root.left, currentLevel-1, resultStr);
            printGivenIndex(root.right, currentLevel-1, resultStr);
        }
    }

}


