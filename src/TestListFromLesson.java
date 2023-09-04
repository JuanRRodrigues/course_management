import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestListFromLesson {

    public static void main(String[] args){
        Lesson a1 = new Lesson("Reviewing the ArrayList", 21);
        Lesson a2 = new Lesson("Lists of Objects", 20);
        Lesson a3 = new Lesson("Relationship Between Lists and Objects", 15);

        ArrayList<Lesson> lessons = new ArrayList<>();
        lessons.add(a1);
        lessons.add(a2);
        lessons.add(a3);

        System.out.println(lessons);

        Collections.sort(lessons);

        System.out.println(lessons);

        lessons.sort(Comparator.comparing(Lesson::getTime));

        System.out.println(lessons);
    }
}
