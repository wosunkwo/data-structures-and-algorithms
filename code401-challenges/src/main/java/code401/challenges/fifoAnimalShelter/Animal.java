package code401.challenges.fifoAnimalShelter;

public class Animal {
    //class to hold data about a dog
    public static class Dog {
       static String dog;
        public Dog(){
            dog = "dog";
        }

        public static String getAnimal() {
            return dog;
        }
    }

    //class to hold data about a cat
    public static class Cat {
        String cat;
        public Cat(){
            cat = "cat";
        }

        public String getAnimal() {
            return cat;
        }
    }
}
