package Module3_AdvancedJavaConcepts.Part4.Task3_SerializationOfCourseEnrollment;
import java.io.Serializable;

class Course implements Serializable {
    private String courseCode;
    private String courseName;
    private String instructor;

    public Course(String courseCode, String courseName, String instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }
    public String getCourseName(){
        return courseName;
    }
    public String toString() {
        return "Course code: " + courseCode + ", course name: '" + courseName + "', instructor: '" + instructor + "'";
    }
}
