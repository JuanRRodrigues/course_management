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

        javaColections.enrollment(a1);
        javaColections.enrollment(a2);
        javaColections.enrollment(a3);

        System.out.println("All Enrolled Students: ");
        javaColections.getStudents().forEach(a -> {
            System.out.println(a);
        });


        System.out.println("The student" + a1 + "Is Enrolled? ");
        System.out.println(javaColections.isEnrolled(a1));

        Student turini = new Student("Rodrigo Turini", 314672);
        System.out.println("E esse Turini, está matriculado: ");
        System.out.println(javaColections.isEnrolled(turini));

        System.out.println("O a1 é equal ao Turini");
        System.out.println(a1.equals(turini));

    }


}
