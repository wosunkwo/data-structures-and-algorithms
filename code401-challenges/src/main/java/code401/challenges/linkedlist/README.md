# Singly Linked List
<!-- Short summary or background information -->
This folder contains a linked list class and a node class. The an integer linked list class can perform 3 things:
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
