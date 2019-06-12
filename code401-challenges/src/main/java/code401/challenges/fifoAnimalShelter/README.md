# Challenge Summary
<!-- Short summary or background information -->
This folder contains a java program that can add dogs and cats into a queue and take them out. The folder contains two java files: Animals.java, this stores 2 nested classes(Dog class and Cat class)
and AnimalShelter class, which creates two queues to store dog and cat objects. The animal shelter class performs two functions: enqueque(): which adds a new dog or cat instancwe to the back of the queue, anbd dequeue(): which removes a cat or dog from the queue.

## Challenge Description
<!-- Description of the challenge -->
Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach.
Implement the following methods:
enqueue(animal): adds animal to the shelter. animal can be either a dog or a cat object.
dequeue(pref): returns either a dog or a cat. If pref is not "dog" or "cat" then return null.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I split my main functionality into two queues. One for the dogs and one for the cats. 
Big 0
Enqueue Time: 0(1)
Dequeue Time: 0(1)

Enqueue Space: 0(n)
Dequeue Space: 0(n)

## Solution
<!-- Embedded whiteboard image -->

## LINK TO CODE
 
[AnimalShelter](https://github.com/wosunkwo/data-structures-and-algorithms/blob/master/code401-challenges/src/main/java/code401/challenges/fifoAnimalShelter/AnimalShelter.java)
-----------------------------------------------------------------------------------------------------
[AnimalShelterTest](https://github.com/wosunkwo/data-structures-and-algorithms/blob/master/code401-challenges/src/test/java/code401/challenges/fifoAnimalShelter/AnimalShelterTest.java)
