package code401.challenges.FizzBuzzTree;

import code401.challenges.tree.Node;

public class FizzBuzzTree {

    public Node<String> fizzbuzz(Node<String> root){
        try{
            if(root== null){
                return null;
            }else{
                if(Integer.parseInt(root.getValue()) % 5 == 0 && Integer.parseInt(root.getValue()) % 3 == 0){
                    root.setValue("FizzBuzz");
                }else if(Integer.parseInt(root.getValue()) % 3 == 0){
                    root.setValue("Fizz");
                }else if(Integer.parseInt(root.getValue()) % 5 == 0){
                    root.setValue("Buzz");
                }
                fizzbuzz(root.getLeft());
                fizzbuzz(root.getRight());
                return root;
            }
        }catch(NumberFormatException e){
            System.out.println("We are trying to do a math equation on a string at: " + root.getValue());
            return null;
        }
    }
}
