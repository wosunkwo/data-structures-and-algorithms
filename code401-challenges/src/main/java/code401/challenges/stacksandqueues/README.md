# Stacks and Queues
<!-- Short summary or background information -->
This folder contains a stack and queue class. The stack class can perform 3 operations (push(), pop(), peek()). The queue class can perform 3 operations (enqueue(), dequeue(), peek())

## Challenge
<!-- Description of the challenge -->
Create a Node class that has properties for the value stored in the Node, and a pointer to the next node.

Create a Stack class that has a top property. It creates an empty Stack when instantiated.
This object should be aware of a default empty value assigned to top when the stack is created.
Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.
Define a method called peek that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.

Create a Queue class that has a front property. It creates an empty Queue when instantiated.
This object should be aware of a default empty value assigned to front when the queue is created.
Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
Define a method called peek that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I took a single responsibility approach. I created multiple functions for my class that perform single tasks. 

## API
<!-- Description of each method publicly available to your Stack and Queue-->
Stack
push() - This adds a new node to the top of the stack
pop() - This removes a node from the top of the stack
peek() - This returns the value at the top of the stack

Queue
enqueue() - This adds a new node to the back of the queue
dequeue() - This removes a node from the front of the queue
peek() - This returns the value at the front of the queue
