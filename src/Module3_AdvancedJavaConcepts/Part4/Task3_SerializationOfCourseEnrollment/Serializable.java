package Module3_AdvancedJavaConcepts.Part4.Task3_SerializationOfCourseEnrollment;
import java.io.*;

class Main {
    private final static String FILENAME = "enrollment.ser";

    public static void main(String[] args) {
        Student student1 = new Student(1, "Bob", 20);
        Course course1 = new Course("12345", "Computer Science", "Spiderman");
        Enrollment enrollment1 = new Enrollment(student1, course1, "12.4.2023");

        serialize(enrollment1);
        Enrollment deserializedEnrollment1 = deserialize();
        System.out.println("\nDeserialization successful for: \n" + deserializedEnrollment1);
    }

    private static void serialize(Enrollment enrollment) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILENAME);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(enrollment);
            System.out.println("\nSerialization successful for: \n" + enrollment);
        } catch (IOException e) {
            System.err.println("Error during serialization: " + e.getMessage());
        }
    }

    private static Enrollment deserialize() {
        Enrollment enrollment = null;
        try (FileInputStream fileInputStream = new FileInputStream(FILENAME);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            enrollment = (Enrollment) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error during deserialization: " + e.getMessage());
        }
        return enrollment;
    }
}
