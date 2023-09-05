import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Course {

    private String name;
    private String instructor;
    private List<Lesson> lessons = new LinkedList<Lesson>();

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
}
