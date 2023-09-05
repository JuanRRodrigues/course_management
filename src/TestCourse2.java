import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestCourse2 {


    public static void main(String[] args){
        Course javaColections = new Course("Mastering Java Collections", "Juan Rodrigues");

    //    javaColections.getLessons().add(new Lesson("Reviewing the ArrayList", 21));
          javaColections.addCourse(new Lesson("Reviewing the ArrayList", 21));
          javaColections.addCourse(new Lesson("Creating a Lesson", 20));
          javaColections.addCourse(new Lesson("Modeling with Collections", 22));

        List<Lesson> lessonsImmutable  = javaColections.getLessons();
        System.out.println(lessonsImmutable);

        List<Lesson> lessons = new ArrayList<>(lessonsImmutable);

        Collections.sort(lessons);
        System.out.println(lessons);

        System.out.println(lessons);
        System.out.println(javaColections.getTimeTotal());

    }
}
