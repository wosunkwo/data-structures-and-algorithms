# Hashmap LEFT JOIN
<!-- Short summary or background information -->
This readme explains the code in the leftJoin.java file. This code contains a method that performs a left join on two hashmaps.
It collects two hasmaps of string and string as key value pairs, and performs a left join on them and return an arraylist of 
strings as the result.

## Challenge
<!-- Description of the challenge -->
Implement a simplified LEFT JOIN for 2 Hashmaps.
Write a function that LEFT JOINs two hashmaps into a single data structure.
The first parameter is a hashmap that has word strings as keys, and a synonym of the key as values.
The second parameter is a hashmap that has word strings as keys, and antonyms of the key as values.
Combine the key and corresponding values (if they exist) into a new data structure according to LEFT JOIN logic.
LEFT JOIN means all the values in the first hashmap are returned, and if values exist in the “right” hashmap,
they are appended to the result row. If no values exist in the right hashmap, then some flavor of NULL should be
appended to the result row.
The returned data structure that holds the results is up to you. It doesn’t need to exactly match the output below, so long as it achieves the LEFT JOIN logic.
![alt_text](https://codefellows.github.io/common_curriculum/data_structures_and_algorithms/Code_401/class-33/dsa-33-io-table.png)


## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I took a single responsibility approach
Big 0
Time - 0(n) where n is the size of the first hashmap
Space - 0(n) where n is the size of the first hashmap

## Solution
<!-- Embedded whiteboard image -->


## CODE
> [LeftJoin.java](https://github.com/wosunkwo/data-structures-and-algorithms/blob/master/code401-challenges/src/main/java/code401/challenges/LeftJoin/LeftJoin.java)
> [LeftJoinTest.java](https://github.com/wosunkwo/data-structures-and-algorithms/blob/master/code401-challenges/src/test/java/code401/challenges/LeftJoin/LeftJoinTest.java)
