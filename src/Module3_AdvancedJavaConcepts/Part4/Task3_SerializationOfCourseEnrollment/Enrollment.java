package Module3_AdvancedJavaConcepts.Part4.Task3_SerializationOfCourseEnrollment;
import java.io.Serializable;
class Enrollment implements Serializable {
    private Student student;
    private Course course;
    private String enrollmentDate;

    public Enrollment(Student student, Course course, String enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    @Override
    public String toString() {
        return "STUDENT: " + student + " \nCOUSRE: " + course + "\nENROLLMENT DATE: " + enrollmentDate;
    }

    public Object getStudent() {
        return student;
    }
}
