package code401.challenges.fifoAnimalShelter;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void testForHappyPath(){
        Animal.Dog dog = new Animal.Dog();
        Animal.Cat cat = new Animal.Cat();
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enqueue(dog);
        animalShelter.enqueue(cat);
        assertEquals("This should return true if the return value is ex=qual to cat", "Cat", animalShelter.dequeue("cat"));
    }

    @Test
    public void testForFailPath(){
        AnimalShelter animalShelter = new AnimalShelter();
        assertNull("This should return true if the return value is null", animalShelter.dequeue("potato"));
    }

    @Test
    public void testForEdgePath(){
        Animal.Dog dog = new Animal.Dog();
        Animal.Cat cat = new Animal.Cat();
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enqueue(dog);
        animalShelter.enqueue(cat);
        assertEquals("This should return true if the return value is ex=qual to cat", "Dog", animalShelter.dequeue(""));
    }

}