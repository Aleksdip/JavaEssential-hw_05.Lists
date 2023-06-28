package task_03.listiterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);

        ListIterator <Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()) {
            Integer numb = listIterator.next();
            numbers.set(numb, numb + 1);

        }
        System.out.println(numbers);
    }
}
