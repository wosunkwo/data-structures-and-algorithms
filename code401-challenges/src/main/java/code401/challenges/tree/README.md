# Trees
<!-- Short summary or background information -->
This folder contains 3 classes. A node class, a binary search tree and a binary tree

## Challenge
<!-- Description of the challenge -->
Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
Create a BinaryTree class
Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values, ordered appropriately.
Create a BinarySearchTree class
Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I took a single responsibility approach and also used recursion

## API
<!-- Description of each method publicly available in each of your trees -->
preOrder: this returns an arraylist with the values of the tree arranged in pre order way (root, left, right)
postOrder: this returns an arraylist with the values of the tree arranged in post order way (left, right, root)
inOrder: this returns an arraylist with the values of the tree arranged in in-order way (left, node, right)


## CODE CHALLENEGE
# Challenge Summary
<!-- Short summary or background information -->
I added a new method that transveres through the tree and prints all the values in the tree in a breadth first order

## Challenge Description
<!-- Description of the challenge -->
Write a breadth first traversal method which takes a Binary Tree as its unique input. Without utilizing any of the built-in methods available to your language, traverse the input tree using a Breadth-first approach; print every visited node’s value.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Iused a single responsibility apporach.
I created two helper methods. I to get the height of the tree, and another to get all the values if the tree at a given height level
Complexity:
Time = 0(n), where n is the height of the list
Space = 0(1)


## Solution
<!-- Embedded whiteboard image -->
![alt text](https://github.com/wosunkwo/data-structures-and-algorithms/blob/master/code401-challenges/assets/breadth_first.jpg)

## LINK TO CODE
 
[BreadFirst](https://github.com/wosunkwo/data-structures-and-algorithms/blob/master/code401-challenges/src/main/java/code401/challenges/tree/BinaryTree.java)
-----------------------------------------------------------------------------------------------------
[BreadFirstTest](https://github.com/wosunkwo/data-structures-and-algorithms/blob/master/code401-challenges/src/test/java/code401/challenges/tree/BinaryTreeTest.java)


*************************************************************************************************************************
## CODE CHALLENGE
Maximum value in a binary tree

# Challenge Summary
<!-- Short summary or background information -->
I added a new method to my binary tree called find max value. It goes through the binary tree recursively and finds the largest integer value, then returns it.

## Challenge Description
<!-- Description of the challenge -->
Write a function called find-maximum-value which takes binary tree as its only input. Without utilizing any of the built-in methods available to your language, return the maximum value stored in the tree. You can assume that the values stored in the Binary Tree will be numeric.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I took a single respinsibility approach
Time - 0(n) where n is the height of the tree
Space - 0(1)

## Solution
<!-- Embedded whiteboard image -->
![alt text](https://github.com/wosunkwo/data-structures-and-algorithms/blob/master/code401-challenges/assets/find_maximum_binary_tree.jpg)

## LINK TO CODE
 
[MaxValue](https://github.com/wosunkwo/data-structures-and-algorithms/blob/master/code401-challenges/src/main/java/code401/challenges/tree/BinaryTree.java)
-----------------------------------------------------------------------------------------------------
[MaxValueTest](https://github.com/wosunkwo/data-structures-and-algorithms/blob/master/code401-challenges/src/test/java/code401/challenges/tree/BinaryTreeTest.java)

