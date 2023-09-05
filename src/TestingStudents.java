import java.util.*;

public class TestingStudents {

    public static void main(String[] args){
        Collection<String> students = new HashSet<>();
        students.add("Rodrigo Turini");
        students.add("Alberto Souza");
        students.add("Nico Steppat");
        students.add("Sergio Lopes");
        students.add("Renan Saggio");
        students.add("Mauricio Aniche");

        boolean juanEstaMatriculado = students.contains("Juan Rodrigues");
        students.remove("Albeto Souza");
        System.out.println(juanEstaMatriculado);


        System.out.println(students.size());

        for(String student : students){
            System.out.println(student);
        }

        students.forEach(System.out::println);

        List<String> studentsList = new ArrayList<>(students);
    }

}
