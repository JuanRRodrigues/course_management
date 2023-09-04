public class Lesson implements Comparable<Lesson> {

    private String title;
    private int time;

    public Lesson(String title, int time) {
        this.title = title;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "[Lesson: " + this.title + ", " + this.time + " minuto]";
    }

    @Override
    public int compareTo(Lesson OtherLesson) {
        return this.title.compareTo((OtherLesson.title));
    }
}
