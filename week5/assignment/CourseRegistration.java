package week5.assignment;

import java.util.ArrayList;

class CourseRegistration {
    private ArrayList<Student> students = new ArrayList<>();
    private static final int MAX_STUDENTS = 5;

    public void registerStudent(Student student) throws CourseFullException {
        if (students.size() >= MAX_STUDENTS) {
            throw new CourseFullException("The course is full. Cannot register more students.");
        }
        students.add(student);
        System.out.println("Student " + student.getName() + " registered successfully.");
    }

    public int getRegisteredCount() {
        return students.size();
    }
}
