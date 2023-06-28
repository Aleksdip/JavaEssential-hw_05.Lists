package task_01.animals;

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
        for (Zoo animal : zoo.listZoo) {
            System.out.println(animal);
        }


        System.out.println("\nAfter change:");

        zoo.listZoo.remove(new Zoo("Dog"));
        zoo.listZoo.remove(new Zoo("Tiger"));
        zoo.listZoo.remove(new Zoo("Lion"));

        int size = zoo.listZoo.size();
        System.out.println("\nРозмір оновленого списку : "+size);

        for (Zoo animal : zoo.listZoo) {
            System.out.println(animal);
        }




        }
    }

