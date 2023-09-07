import java.sql.SQLOutput;

public class TestingCourseWithStudent {

    public static void main(String[] args){

        Course javaColections = new Course("Mastering Java Collections", "Juan Rodrigues");
        javaColections.addCourse(new Lesson("Reviewing the ArrayList", 21));
        javaColections.addCourse(new Lesson("Creating a Lesson", 20));
        javaColections.addCourse(new Lesson("Modeling with Collections", 22));


        Student a1 = new Student("Rodrigo Turini", 34672);
        Student a2 = new Student("Guilherme Silveira", 5617);
        Student a3 = new Student("mauricio Aniche", 17645);

        javaColections.matricula(a1);
        javaColections.matricula(a2);
        javaColections.matricula(a3);

        System.out.println("All Enrolled Students: ");
        javaColections.getStudents().forEach(a -> {
            System.out.println(a);
        });


    }


}
