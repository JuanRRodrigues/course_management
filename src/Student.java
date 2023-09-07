public class Student {

    private String name;
    private int studentNumber;

    public Student(String name, int studentNumber){
        if(name == null){
            throw new NullPointerException("Name Cannot be null");
        }
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    @Override
    public boolean equals(Object obj) {
        Student other = (Student) obj;
        return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public String toString() {
        return "[Student: " + this.name + ", Student Number: " + this.studentNumber + "]";
    }
}
