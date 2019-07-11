package code401.challenges.treeIntersection;

import code401.challenges.tree.Node;
import java.util.ArrayList;
import java.util.HashMap;

public class TreeIntersection {

        public ArrayList<Integer> tree_intersection(Node root1, Node root2) {
            ArrayList<Integer> duplicateArrList = new ArrayList<>();
            if(root1 == null){
                return duplicateArrList;
            }
            if(root2 == null){
                return duplicateArrList;
            }

            HashMap<Integer, Integer> duplicateHash = new HashMap<>();
            int dummyCnt = 0;
            hashFirstTree(root1, duplicateHash, dummyCnt);
            hashSecondTree(root2, duplicateHash, dummyCnt, duplicateArrList);
            return duplicateArrList;
        }

    private void hashFirstTree(Node<Integer> node, HashMap<Integer, Integer> duplicateHash, int dummyCnt){
            if(node == null){
                return;
            }else{
                dummyCnt++;
                if(duplicateHash.get(node.getValue()) == null){
                    duplicateHash.put(node.getValue(), dummyCnt);
                }
                hashFirstTree(node.getLeft(), duplicateHash, dummyCnt);
                hashFirstTree(node.getRight(), duplicateHash, dummyCnt);
            }
    }

    private void hashSecondTree(Node<Integer> node, HashMap<Integer, Integer> duplicateHash, int dummyCnt, ArrayList<Integer> duplicateArrList){
        if(node == null){
            return;
        }else{
            dummyCnt++;
            if(duplicateHash.get(node.getValue()) != null){
                duplicateArrList.add(node.getValue());
            }
            hashSecondTree(node.getLeft(), duplicateHash, dummyCnt, duplicateArrList);
            hashSecondTree(node.getRight(), duplicateHash, dummyCnt, duplicateArrList);
        }
    }
}
