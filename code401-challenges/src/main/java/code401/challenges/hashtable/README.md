## Background info:
This class implements a hash table, which maps keys to values. Any non-null object can be used as a key or as a value.
To successfully store and retrieve objects from a hashtable, the objects used as keys must implement the hashCode method and the equals method.

It is similar to HashMap, but is synchronised.
Hashtable stores key/value pair in hash table.
In Hashtable we specify an object that is used as a key, and the value we want to associate to that key.
The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table.

## Challenge
Implement a Hashtable with the following methods:
- add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
- get: takes in the key and returns the value from the table.
- contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
- hash: takes in an arbitrary key and returns an index in the collection.
- Structure and Testing:
Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge. You will be given feedback and marked down if you attempt to define a large, complex algorithm in one function definition.

Write tests to prove the following functionality:

- Adding a key/value to your hashtable results in the value being in the data structure
- Retrieving based on a key returns the value stored
- Successfully returns null for a key that does not exist in the hashtable
- Successfully handle a collision within the hashtable
- Successfully retrieve a value from a bucket within the hashtable that has a collision
- Successfully hash a key to an in-range value


## Approach & Efficiency
I declared a node class which created a node with key and value pair.
I used nodes and array (bucket) to implement hashtable for this problem.
I decleared a constructor that takes in the size of the hashtable
Then I created a method add which took in a key, value pair, got the index from the hashcode of the key, and appended the key, value pair to the node that's present on that index.
I created a contains method which took in a string key, and returned a boolean if that key is present in the hash table.
I created get method that took in a string key and returns the value assosiated with that key.


## API

- add(): This method takes in a string key and a value and adds the data to the hash table.

- contains(): This method takes in a string key and returns a boolean based on if the hash table contains a key that matches the provided string.

- get(): This method takes in a string key and returns the value assosiated with that key.

- getHash(): This method takes in a string key and returns an integer which is the sum of the ascii value of each characters of the string provided.


## [HashTable.java:](https://github.com/wosunkwo/data-structures-and-algorithms/blob/master/code401-challenges/src/main/java/code401/challenges/hashtable/Hashtable.java)

## [HashTableTest.java](https://github.com/wosunkwo/data-structures-and-algorithms/blob/master/code401-challenges/src/test/java/code401/challenges/hashtable/HashtableTest.java)
