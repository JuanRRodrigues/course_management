import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String lesson1 = "Getting to Know List";
        String lesson2 = "Modelling the Class Lesson";
        String lesson3 = "Working with Courses and Sets";

        ArrayList<String> lessons = new ArrayList<>();
        lessons.add(lesson1);
        lessons.add(lesson2);
        lessons.add(lesson3);

        System.out.println(lessons);

        lessons.remove(0);

        System.out.println(lessons);

        for (String aula: lessons) {
            System.out.println("Lesson " + aula);

        }

        String primeiraAula = lessons.get(0);
        System.out.println("The First Lesson " + primeiraAula);

        for (int i = 0; i < lessons.size(); i++){
            System.out.println("Lesson : " + lessons.get(i));
        }

        System.out.println(lessons.size());

        lessons.forEach(aula -> {
            System.out.println("Traversing :" + aula);
            System.out.println("Lesson" + aula);
        });

        lessons.add("Increasing our Knowledge");
        Collections.sort(lessons);

        System.out.println("Sorting a List");
        System.out.println(lessons);
    }
}