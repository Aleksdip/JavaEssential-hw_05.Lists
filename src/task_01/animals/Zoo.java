package task_01.animals;

import java.util.ArrayList;
import java.util.Objects;

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
//to delete an object by value, need to override the method equals and hashCode
 @Override
 public boolean equals(Object o) {
  if (this == o) return true;
  if (o == null || getClass() != o.getClass()) return false;
  Zoo zoo = (Zoo) o;
  return Objects.equals(listZoo, zoo.listZoo) && Objects.equals(name, zoo.name);
 }

 @Override
 public int hashCode() {
  return Objects.hash(listZoo, name);
 }
}
