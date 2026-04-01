import java.util.HashMap;
import java.util.Map;

public class StudentManager {

    private Map<String, StudentAccount> students;

    public StudentManager() {
        students = new HashMap<>();
    }

    // Add a new student
    public void addStudent(String studentId, double initialBalance) {
        if (students.containsKey(studentId)) {
            System.out.println("Student already exists.");
            return;
        }

        students.put(studentId, new StudentAccount(studentId, initialBalance));
        System.out.println("Student added: " + studentId);
    }

    // Get student by ID
    public StudentAccount getStudent(String studentId) {
        return students.get(studentId);
    }

    // Print a student's tier
    public void printStudentTier(String studentId) {
        StudentAccount student = students.get(studentId);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        student.printSummary();
    }
}