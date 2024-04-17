package Module3_AdvancedJavaConcepts.Part4.Task3_SerializationOfCourseEnrollment;
import java.io.Serializable;

class Student implements Serializable {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Student id: " + id + ", name: '" + name + "', age: " + age+ " years";
    }
}