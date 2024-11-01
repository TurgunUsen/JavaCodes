public class Student {
    private int id;
    private String name;
    private int age;
    private double grade;

    public Student(int id, String name, int age, double grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + age + "," + grade;
    }

    public static Student fromString(String data) {
        String[] fields = data.split(",");
        int id = Integer.parseInt(fields[0]);
        String name = fields[1];
        int age = Integer.parseInt(fields[2]);
        double grade = Double.parseDouble(fields[3]);
        return new Student(id, name, age, grade);
    }
}

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
        System.out.println("Student with ID " + id deleted successfully.");
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

import java.io.IOException;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        String filePath = "students.txt";
        StudentManager manager = new StudentManager(filePath);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        System.out.print("Enter name: ");
                        String name = scanner.next();
                        System.out.print("Enter age: ");
                        int age = scanner.nextInt();
                        System.out.print("Enter grade: ");
                        double grade = scanner.nextDouble();
                        Student newStudent = new Student(id, name, age, grade);
                        manager.addStudent(newStudent);
                        System.out.println("Student added successfully.");
                        break;
                    case 2:
                        manager.displayStudents();
                        break;
                    case 3:
                        System.out.print("Enter ID of student to update: ");
                        id = scanner.nextInt();
                        System.out.print("Enter new age: ");
                        age = scanner.nextInt();
                        System.out.print("Enter new grade: ");
                        grade = scanner.nextDouble();
                        manager.updateStudent(id, age, grade);
                        break;
                    case 4:
                        System.out.print("Enter ID of student to delete: ");
                        id = scanner.nextInt();
                        manager.deleteStudent(id);
                        break;
                    case 5:
                        System.out.println("Exiting the system. Goodbye!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option. Please choose again.");
                }
            } catch (IOException e) {
                System.err.println("Error managing students: " + e.getMessage());
            }
        }
    }
}
