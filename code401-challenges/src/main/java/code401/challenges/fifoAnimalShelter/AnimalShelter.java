package code401.challenges.fifoAnimalShelter;

import code401.challenges.stacksandqueues.Queue;

public class AnimalShelter {
    Queue <Animal.Dog> dogQueue;
    Queue <Animal.Cat> catQueue;
    int timeStamp; // variable that stores a number that represents the sequence when the animal was added to the queue

    public AnimalShelter(){
        dogQueue = new Queue<>();
        catQueue = new Queue<>();
        timeStamp = 0;
    }

    //method that is called to add a new dog to the dog queue
    public void enqueue(Animal.Dog dog){
        timeStamp++;
        dogQueue.enqueue(dog, timeStamp);
    }

    //method that is called to add a new cat to the cat queue
    public void enqueue(Animal.Cat cat){
        timeStamp++;
        catQueue.enqueue(cat, timeStamp);
    }

    //function that removes an animal from the queue based on the parameter. If the parameter is neither "dog" nor "cat", it will return the animal that has
    // been in the queue the longest. If there are no more animals in the queue it will return null

    public String dequeue(String pref){
        if ((pref.toLowerCase()).equals("dog")){
            if(dogQueue.peek() != null){
                dogQueue.dequeue();
                return "Dog";
            }else{
                return "There are no more dogs left to remove";
            }
        }else if ((pref.toLowerCase()).equals("cat")){
            if(catQueue.peek() != null){
                catQueue.dequeue();
                return "Cat";
            }else{
                return "There are no more cats left to remove";
            }
        }else{
            if(dogQueue.peek() != null && catQueue.peek() != null){
                if(dogQueue.peek().getTimeStamp() < catQueue.peek().getTimeStamp()){
                    dogQueue.dequeue();
                    return "Dog";
                }else{
                    catQueue.dequeue();
                    return "Cat";
                }
            }else if(dogQueue.peek() != null) {
                dogQueue.dequeue();
                return "Dog";
            }else if(catQueue.peek() != null){
                catQueue.dequeue();
                return "Cat";
            }else{
                return null;
            }

        }
    }
}
