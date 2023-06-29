package task_04.friends;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Friends friends = new Friends();
        friends.names.add("Oleksandr");
        friends.names.add("Petro");
        friends.names.add("Grisha");
        friends.names.add("Anton");

        System.out.println(friends.names);


        Collections.sort(friends.names);

        System.out.println(friends.names);


    }
}