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