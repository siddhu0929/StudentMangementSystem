package model;

public class Student {

    private int id;
    private String name;
    private String department;
    private String email;
    private double marks;
    private double attendance;
    private String grade;

    // Empty Constructor
    public Student() {

    }

    // Parameterized Constructor
    public Student(int id,
                   String name,
                   String department,
                   String email,
                   double marks,
                   double attendance,
                   String grade) {

        this.id = id;
        this.name = name;
        this.department = department;
        this.email = email;
        this.marks = marks;
        this.attendance = attendance;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getAttendance() {
        return attendance;
    }

    public void setAttendance(double attendance) {
        this.attendance = attendance;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}