

public class CourseTest {
    public static void main(String[] args) {
        Course course = new Course("javer");
        Course.displayCourse(course);
        String andy = "andy";
        course.addStudent(andy);
        Course.displayCourse(course);
        String booby = "booby";
        course.addStudent(booby);
        Course.displayCourse(course);
        course.removeStudent(andy);
        Course.displayCourse(course);
        String samy = "samy";
        course.removeStudent(andy);
        Course.displayCourse(course);
    }
}