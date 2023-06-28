package task_01.animals;

import java.util.ArrayList;

public class Zoo {
 ArrayList<Zoo> listZoo;
 String name;

 public Zoo(String name) {
  this.name = name;
 }

 public Zoo() {
  this.listZoo = new ArrayList<>();
 }

 @Override
 public String toString() {
  return name;
 }

 public void printList() {
  for (Zoo zoo : listZoo) {
   System.out.println(zoo.toString());



  }
 }
}
