package task_01.animals;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Create list, add inside animals
        ArrayList<Zoo> animals = new ArrayList<>();
        animals.add(0,new Zoo("Wolf"));
        animals.add(1,new Zoo("Cat"));
        animals.add(2,new Zoo("Dog"));
        animals.add(3,new Zoo("Giraffe"));
        animals.add(4,new Zoo("Tiger"));
        animals.add(5,new Zoo("Elephant"));
        animals.add(6,new Zoo("Lion"));
        animals.add(7,new Zoo("Turtle"));

//        Create a list of the class Zoo by passing animals
        Zoo zoo = new Zoo(animals);

//        void listZoo
        zoo.printList();



        }
    }

