

public class TestCourse {


    public static void main(String[] args){
        Course javaColections = new Course("Mastering Java Collections", "Juan Rodrigues");

    //    javaColections.getLessons().add(new Lesson("Reviewing the ArrayList", 21));
          javaColections.addCourse(new Lesson("Reviewing the ArrayList", 21));
          javaColections.addCourse(new Lesson("Creating a Lesson", 20));
          javaColections.addCourse(new Lesson("Modeling with Collections", 22));

        System.out.println(javaColections.getLessons());

    }
}
