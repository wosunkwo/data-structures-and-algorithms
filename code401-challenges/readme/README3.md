# Challenge Summary
<!-- Short summary or background information -->
This code challenge deals with binary search.
In the BinarySearch class i am defining a function called binarySearch that gets in an array and a key and checks if the key is present in the array.

## Challenge Description
<!-- Description of the challenge -->
This challenge requires the function to take in two arguments (a sorted array, and a key) and if the key is found in the array, return the index where the key was found, and if the key is not found return -1.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I used a divide and conquer approach to solving this challenge. Because since the array is sorted it makes sense to cut the array in half anytime the key has not been found. The Big 0 time complexity is 0(logn), where n is the size of the array.

## Solution
<!-- Embedded whiteboard image -->
![alt text](https://github.com/wosunkwo/data-structures-and-algorithms/blob/master/code401-challenges/assets/array_binary_search.jpg)

## Link to Code
[BinarySearch](https://github.com/wosunkwo/data-structures-and-algorithms/blob/master/code401-challenges/src/main/java/code401/challenges/BinarySearch.java)
## 
[BinarySearchTest](https://github.com/wosunkwo/data-structures-and-algorithms/blob/master/code401-challenges/src/test/java/code401/challenges/BinarySearchTest.java)
