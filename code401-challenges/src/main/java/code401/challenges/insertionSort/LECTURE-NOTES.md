# Lecture Notes: Insertion Sort
Insertion Sort is an algorithm for ordering a number of items or an array. This method is based on the way card players
sort a hand of playing cards.
We start with an empty left hand and the cards laid down on the table. We then remove one card at a time from the table 
and insert it into the correct position in the left hand. To find the correct position for a new card, we compare it with
the already sorted set of cards in the hand, from right to left.

Is it more efficient than others? How does it attack the problem differently?
It is not the most efficient sorting algorithmn because it uses a while loop inside of a for lopp and that takes an exponential
time complexity to sort a list.

Time Complexity = O(n^2)
Space Complexity = O(1)

# Learning Objectives
# After this lecture:
The students should be able to implement a basic insertion sort
The students should understand why the algotihmn uses a 0(n^2) time complexity


# Diagram
![alt_text](https://cdncontribute.geeksforgeeks.org/wp-content/uploads/insertionsort.png)

# Algorithm
The algorithmn creates a for loop(i) that starts from index 1 till the end of the array(this will handle
the unsorted part of the array), and a variable(j) that starts at index 0 until where ever index the for loop
is currently at(this will handle the sorted part of the array).
It checks in the inner loop if index(i) is less than index(j) and swaps those two values if true
It then returns the newly sorted array.


# Pseudocode
InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp
      
      

# Readings and References
# Watch
[Video](https://www.youtube.com/watch?v=i-SKeOcBwko)

# Read
[Article 1](https://www.geeksforgeeks.org/insertion-sort/)
-----------------------------------------------------------
[Article 2](https://www.baeldung.com/java-insertion-sort)

# Bookmark
[Website](https://www.javatpoint.com/insertion-sort-in-java)
