# Lecture Notes: Quick Sort
QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around
the picked pivot. There are many different versions of quickSort that pick pivot in different ways.
Always pick first element as pivot.
Always pick last element as pivot (implemented below)
Pick a random element as pivot.
Pick median as pivot.
The key process in quickSort is partition(). Target of partitions is, given an array and an element x of array
as pivot, put x at its correct position in sorted array and put all smaller elements (smaller than x) before x,
and put all greater elements (greater than x) after x. All this should be done in linear time.

Is it more efficient than others? How does it attack the problem differently?
It is very efficient because it uses a divide and conquer approach to sort the array, which is a (0)nlogn time complexity

Time Complexity = O(nlog(n))
Space Complexity = O(n)

# Learning Objectives
# After this lecture:
The students should be able to implement a basic quick sort
The students should understand why the algotihmn uses a O(nlog(n)) time complexity


# Diagram
![alt_text](https://www.geeksforgeeks.org/wp-content/uploads/gq/2014/01/QuickSort2.png)
![alt_text](https://he-s3.s3.amazonaws.com/media/uploads/1ea505b.jpg)

# Algorithm
Taking the analogical view in perspective, consider a situation where one had to sort the papers bearing the names 
of the students, by name. One might use the approach as follows:

Select a splitting value, say L. The splitting value is also known as Pivot.

Divide the stack of papers into two. A-L and M-Z. It is not necessary that the piles should be equal.

Repeat the above two steps with the A-L pile, splitting it into its significant two halves. And M-Z pile, split
into its halves. The process is repeated until the piles are small enough to be sorted easily.

Ultimately, the smaller piles can be placed one on top of the other to produce a fully sorted and ordered set of papers.
The approach used here is recursion at each split to get to the single-element array.

At every split, the pile was divided and then the same approach was used for the smaller piles.
Due to these features, quick sort is also called as partition exchange sort.

# Pseudocode
ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value 
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right. 
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp


      

# Readings and References
# Watch
[Video](https://www.youtube.com/watch?v=SLauY6PpjW4)

# Read
[Article 1](https://www.geeksforgeeks.org/quick-sort/)
-----------------------------------------------------------
[Article 2](https://www.hackerearth.com/practice/algorithms/sorting/quick-sort/tutorial/)

# Bookmark
[Website](https://www.interviewbit.com/tutorial/quicksort-algorithm/)
