package task_05.teachers;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Olga Anatoliivna");
        teachers.add("Veronika Andriivna");
        teachers.add("Marina Victorivna");
        teachers.add("Nelya Oleksiivna");

        int best = teachers.indexOf("Olga Anatoliivna");
        int bad = teachers.indexOf("Nelya Oleksiivna");

        System.out.println(teachers);

        System.out.println("Best teacher index: " + best + ". Bad teacher index: " + bad);

    }
}
