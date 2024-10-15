package week4.assignment;

public class FullTimeProfessor extends Professor {
    // Constructor
    public FullTimeProfessor(String name, String department){
        super(name, department);
        this.salary = 5000; // Fixed monthly salary
    }
    // Overide teachCourse
    public void teachCourse(){
        System.out.println("Full-time Professor " + getName() + "is teaching");
    }
    // Override calcuteSalary
    @Override
    public double calculateSalary(){
        return this.salary;
    }
}
