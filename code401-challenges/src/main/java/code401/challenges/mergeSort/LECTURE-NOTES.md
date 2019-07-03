# Lecture Notes: Merge Sort
The merge sort algorithm is a divide and conquers algorithm. In the divide and conquer paradigm, a problem is 
broken into smaller problems where each small problem still retains all the properties of the larger problem -- 
except its size. To solve the original problem, each piece is solved individually; then the pieces are merged back together.

Is it more efficient than others? How does it attack the problem differently?
It is very efficient because it uses a divide and conquer approach to sort the array, which is a (0)nlogn time complexity

Time Complexity = O(nlog(n))
Space Complexity = O(1)

# Learning Objectives
# After this lecture:
The students should be able to implement a basic merge sort
The students should understand why the algotihmn uses a O(nlog(n)) time complexity


# Diagram
![alt_text](https://www.geeksforgeeks.org/wp-content/uploads/Merge-Sort-Tutorial.png)

# Algorithm
Create a method mergeSortFunc which takes in an array as input.
Divides the array into two parts continuously until it's broken down to one element.
Sort the individual elements from smallest to largest.
Merge the divided array together.
Return the sorted array.

# Pseudocode
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left

      

# Readings and References
# Watch
[Video](https://www.youtube.com/watch?v=iMT7gTPpaqw)

# Read
[Article 1](https://www.java67.com/2018/03/mergesort-in-java-algorithm-example-and.html)
-----------------------------------------------------------
[Article 2](https://www.baeldung.com/java-merge-sort)

# Bookmark
[Website](https://www.geeksforgeeks.org/merge-sort/)
