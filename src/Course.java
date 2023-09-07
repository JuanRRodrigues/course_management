import java.util.*;

public class Course {

    private String name;
    private String instructor;
    private List<Lesson> lessons = new LinkedList<Lesson>();
    private Set<Student> students = new HashSet<>();

    public Course(String name, String instructor) {
        this.name = name;
        this.instructor = instructor;
    }

    public List<Lesson> getLessons() {

        return Collections.unmodifiableList(lessons);
    }



    public String getName() {
        return name;
    }

    public String getInstructor() {
        return instructor;
    }

    public void addCourse(Lesson lesson){
        this.lessons.add(lesson);
    }

    public int getTimeTotal(){
     return this.lessons.stream().mapToInt(Lesson::getTime).sum();
    }

    @Override
    public String toString() {
        return "[Curso:"+ this.getName()+",tempo total:"+ this.getTimeTotal()+ ", aulas: ["+ this.getLessons()+"] ]";
    }

    public void enrollment(Student student) {
        this.students.add(student);
    }

    public Set<Student> getStudents() {
        return Collections.unmodifiableSet(students);
    }

    public boolean isEnrolled(Student student) {
        return this.students.contains(student);
    }

}
