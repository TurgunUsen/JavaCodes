package week2.assignment1.school;

public class Person{

    public String name;
    protected int age;

    // Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displayDetails(){
        System.out.println("Name: " + name + ", Age: " + age);
    }

}