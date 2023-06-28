package task_01.animals;

import java.util.ArrayList;

public class Zoo {
 ArrayList<Zoo> listZoo;
 String name;

 public Zoo(String name) {
  this.name = name;
 }

 public Zoo(ArrayList<Zoo> listAnimals) {
  this.listZoo = listAnimals;
 }

 @Override
 public String toString() {
  return name;
 }

 public void printList() {
  for (Zoo listAnimal : listZoo) {
   System.out.println(listAnimal.toString());



  }
 }
}
