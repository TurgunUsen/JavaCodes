package week4.assignment;

public abstract class Professor{
    private String name;
    private String department;
    private double salary;
}

public Professor(String name, String departtment){
    this.name = name;
    this.department = department;
}

// Abstract method for teaching a course
public abstract void teachCourse();

// Abstract method for calculating salary
public abstract double calculateSalary();

public String getName(){
    return name;
}

public String getDepartment(){
     return department;
}
