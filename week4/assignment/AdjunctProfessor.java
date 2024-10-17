package week4.assignment;

public class AdjunctProfessor extends Professor {
    private int coursesTaught;

    public AdjunctProfessor(String name, String department, int coursesTaught) {
        super(name, department);
        this.coursesTaught = coursesTaught;
        }
    // Override teachCourse
    @Override
    public void teachCourse(){
        System.out.println("Adjunct Professor " + getName() + " is teaching." );
        }

    // Overide calculateSalary
    @Override
    public double calculateSalary(){
        return coursesTaught * 2000;
    }
}
