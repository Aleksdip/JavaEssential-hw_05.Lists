package task_01.animals;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.listZoo.add(0,new Zoo("Wolf"));
        zoo.listZoo.add(1,new Zoo("Cat"));
        zoo.listZoo.add(2,new Zoo("Dog"));
        zoo.listZoo.add(3,new Zoo("Giraffe"));
        zoo.listZoo.add(4,new Zoo("Tiger"));
        zoo.listZoo.add(5,new Zoo("Elephant"));
        zoo.listZoo.add(6,new Zoo("Lion"));
        zoo.listZoo.add(7,new Zoo("Turtle"));

//        view listZoo
        zoo.printList();



        }
    }

