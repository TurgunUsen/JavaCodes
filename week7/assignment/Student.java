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
