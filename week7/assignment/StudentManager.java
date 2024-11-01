package week7.assignment;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private String filePath;

    public StudentManager(String filePath) {
        this.filePath = filePath;
    }

    public void addStudent(Student student) throws IOException {
        List<Student> students = loadStudents();
        students.add(student);
        saveStudents(students);
    }

    public void displayStudents() throws IOException {
        List<Student> students = loadStudents();
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                System.out.println("ID: " + student.getId() + ", Name: " + student.getName() +
                        ", Age: " + student.getAge() + ", Grade: " + student.getGrade());
            }
        }
    }

    public void updateStudent(int id, int age, double grade) throws IOException {
        List<Student> students = loadStudents();
        boolean found = false;
        for (Student student : students) {
            if (student.getId() == id) {
                student.setAge(age);
                student.setGrade(grade);
                found = true;
                break;
            }
        }
        if (found) {
            saveStudents(students);
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public void deleteStudent(int id) throws IOException {
        List<Student> students = loadStudents();
        students.removeIf(student -> student.getId() == id);
        saveStudents(students);
        System.out.println("Student with ID " + id + " deleted successfully.");
    }

    private List<Student> loadStudents() throws IOException {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                students.add(Student.fromString(line));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Starting fresh.");
        }
        return students;
    }

    private void saveStudents(List<Student> students) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Student student : students) {
                writer.write(student.toString());
                writer.newLine();
            }
        }
    }
}
