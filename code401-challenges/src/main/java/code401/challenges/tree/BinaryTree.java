package code401.challenges.tree;

import java.util.ArrayList;

public class BinaryTree {

    Node<Integer> root;

    public BinaryTree(){
        root = null;
    }

    public BinaryTree(Node<Integer> head){
        root = head;
    }

    public void setRoot(Node<Integer> root) {
        this.root = root;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    int height(Node<Integer> root)
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

    public ArrayList<Integer> preOrder(Node<Integer> node){
        ArrayList<Integer> resultArr = new ArrayList<>();
        preOrderHelper(node, resultArr);
        return resultArr;
    }

    public ArrayList<Integer> inOrder(Node<Integer> node){
        ArrayList<Integer> resultArr = new ArrayList<>();
        inOrderHelper(node, resultArr);
        return resultArr;
    }

    public ArrayList<Integer> postOrder(Node<Integer> node){
        ArrayList<Integer> resultArr = new ArrayList<>();
        postOrderHelper(node, resultArr);
        return resultArr;
    }

    public void preOrderHelper(Node<Integer> node, ArrayList<Integer> resultArr){
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


    public void inOrderHelper(Node<Integer> node, ArrayList<Integer> resultArr){
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


    public void postOrderHelper(Node<Integer> node, ArrayList<Integer> resultArr){
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

    public Integer find_maximum_value(Node<Integer> root){
        try{
            if(root == null)
                return Integer.MIN_VALUE;

            Integer max = root.value;
            Integer otherMax = Math.max(find_maximum_value(root.getLeft()), find_maximum_value(root.getRight()));
            if (otherMax > max)
                max = otherMax;
            return max;
        }catch(NullPointerException e){
            System.out.println("error");
            return -1;
        }
        }







//        public static void main(String[] args){
//
//            Node<Integer> root = new Node(2);
//            root.setLeft(new Node(7));
//            root.setRight(new Node(5));
//            root.getLeft().setRight(new Node(6));
//            root.getLeft().getRight().setLeft(new Node(1));
//            root.getRight().setRight(new Node(11));
//            root.getRight().setLeft(new Node(4));
//            root.getRight().getRight().setLeft(new Node(9));
//
//
//            BinaryTree tree = new BinaryTree(root);
//            System.out.println(tree.find_maximum_value(tree.getRoot()));
//
//        }
}


