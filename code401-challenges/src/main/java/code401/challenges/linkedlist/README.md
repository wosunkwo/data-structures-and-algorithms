LAB
# Singly Linked List
<!-- Short summary or background information -->
This folder contains a linked list class and a node class. The integer linked list class can perform 3 things:
Insert-> this adds a new value to the top of the linked list
Includes-> this checks if the linked list contains a perticular value and returns true if the value is in the linked list or false if the value is not in the linked list
Print-> this returns the values in the linked list in form of an array

## Challenge
<!-- Description of the challenge -->
Create a linked list class that can perform insert, includes and print

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I took an Object Oriented approach. I encapsulated all my functionalities inside of seperate methods and put all my methods inside of a class
Insert -> 0(1)
Includes (worst case) -> 0(n) where n is the size of the linked list
print -> 0(n) where n is the size of the linked list

## API
<!-- Description of each method publicly available to your Linked List -->
void insert(int value)
boolean includes(int value)
int[] print()



------------------------------------------------------------------------------------------------------------------------------
CODE CHALLENEGE 6
# Challenge Summary
<!-- Short summary or background information -->
This folder contains a linked list class and a node class. The integer linked list class can now perform 3 more things:
append-> This adds a new value to the end of the linked list
insertBefore-> This adds a new value at the back of a specified value
insertAfter-> This adds a new value at the front of a specified value

## Challenge Description
<!-- Description of the challenge -->
Create a linked list class that can perform append(), insertBefore() and insertAfter()

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I took an Object Oriented approach. I encapsulated all my functionalities inside of seperate methods and put all my methods inside of a class
append -> 0(n) where n is the size of the linked list
insertBefore (worst case) -> 0(n) where n is the size of the linked list
insertAfter (worst case) -> 0(n) where n is the size of the linked list

## Solution
<!-- Embedded whiteboard image -->
![alt text](https://github.com/wosunkwo/data-structures-and-algorithms/blob/master/code401-challenges/assets/ll_insertions.jpeg)

----------------------------------------------------------------------------------------------------
 ## LINK TO CODE
 
[LinkedList](https://github.com/wosunkwo/data-structures-and-algorithms/blob/master/code401-challenges/src/main/java/code401/challenges/linkedlist/LinkedList.java)
-----------------------------------------------------------------------------------------------------
[LinkedListTest](https://github.com/wosunkwo/data-structures-and-algorithms/blob/master/code401-challenges/src/test/java/code401/challenges/linkedlist/LinkedListTest.java)

------------------------------------------------------------------------------------------------------
CODE CHALLENGE 7

# Challenge Summary
<!-- Short summary or background information -->
This added a new method to my linked list class called knthFromEnd, that goes through the linked list and returns the kth value from the end of the linked list

## Challenge Description
<!-- Description of the challenge -->
Write a method for the Linked List class which takes a number, k, as a parameter. Return the node’s value that is k from the end of the linked list. 

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I took a more efficient approach. I kept track of the size of my linked list in an instance variable, and to get the kth index value from the end of the list, I subtracted k from the size of the linked list. I then transvered through my list until i got to that index, then i returned that index value

Time
O(n-k) worst case: where n represents the size of the linked list, and is the kth value
O(1) best case: if the value we are looking for is the first node in our list

Space
O(1)

## Solution
<!-- Embedded whiteboard image -->
![alt text](https://github.com/wosunkwo/data-structures-and-algorithms/blob/master/code401-challenges/assets/ll_kth_from_end.jpg)

## LINK TO CODE
 
[LinkedList](https://github.com/wosunkwo/data-structures-and-algorithms/blob/master/code401-challenges/src/main/java/code401/challenges/linkedlist/LinkedList.java)
-----------------------------------------------------------------------------------------------------
[LinkedListTest](https://github.com/wosunkwo/data-structures-and-algorithms/blob/master/code401-challenges/src/test/java/code401/challenges/linkedlist/LinkedListTest.java)

-------------------------------------------------------------------------------------------------------
CODE CHALLENEGE 8
# Challenge Summary
<!-- Short summary or background information -->
This new feature implements a merge list method that adds two linked list together and saves them in a new linkedlist and returns the head of the new linked list

## Challenge Description
<!-- Description of the challenge -->
Write a function called mergeLists which takes two linked lists as arguments. Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I took a brute force approach. I created a new linkedlist instance and transversed through the two initial linkedlist, appending the initial linkedlist values to this new linkedlist.
Space Complexity
O(n + m) - Where n is the size of first linked list, and m is the size of the second linked list

Time Complexoty
O(n) - Where n is the size of the largest linked list out of the two that get passed

## Solution
<!-- Embedded whiteboard image -->
## LINK TO CODE
 
[LinkedList](https://github.com/wosunkwo/data-structures-and-algorithms/blob/master/code401-challenges/src/main/java/code401/challenges/linkedlist/LinkedList.java)
-----------------------------------------------------------------------------------------------------
[LinkedListTest](https://github.com/wosunkwo/data-structures-and-algorithms/blob/master/code401-challenges/src/test/java/code401/challenges/linkedlist/LinkedListTest.java)

