package dao;

import config.DBConnection;
import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDAO {

    public void addStudent(Student student) {

        try {

            Connection con = DBConnection.getConnection();

            String query =
                    "INSERT INTO students(name, department, email, marks, attendance, grade) VALUES(?,?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, student.getName());
            ps.setString(2, student.getDepartment());
            ps.setString(3, student.getEmail());
            ps.setDouble(4, student.getMarks());
            ps.setDouble(5, student.getAttendance());
            ps.setString(6, student.getGrade());

            ps.executeUpdate();

            System.out.println("Student Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewStudents() {

        try {

            Connection con = DBConnection.getConnection();

            String query = "SELECT * FROM students";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                System.out.println("---------------------------");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Department: " + rs.getString("department"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Marks: " + rs.getDouble("marks"));
                System.out.println("Attendance: " + rs.getDouble("attendance"));
                System.out.println("Grade: " + rs.getString("grade"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id) {

        try {

            Connection con = DBConnection.getConnection();

            String query = "DELETE FROM students WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Student Deleted Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Student searchStudent(int id) {

        try {

            Connection con = DBConnection.getConnection();

            String query =
                    "SELECT * FROM students WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Student student = new Student();

                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setDepartment(rs.getString("department"));
                student.setEmail(rs.getString("email"));
                student.setMarks(rs.getDouble("marks"));
                student.setAttendance(rs.getDouble("attendance"));
                student.setGrade(rs.getString("grade"));

                return student;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}