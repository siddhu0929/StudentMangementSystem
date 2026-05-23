package service;

import dao.StudentDAO;
import model.Student;
import util.PerformanceAnalyzer;

public class StudentService {

    StudentDAO dao = new StudentDAO();

    public void addStudent(Student student) {

        String grade =
                PerformanceAnalyzer.calculateGrade(student.getMarks());

        student.setGrade(grade);

        dao.addStudent(student);
    }
}