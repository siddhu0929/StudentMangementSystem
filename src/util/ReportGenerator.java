package util;

import model.Student;

import java.io.FileWriter;

public class ReportGenerator {

    public static void generateReport(Student student) {

        try {

            FileWriter writer =
                    new FileWriter(
                            "student_" + student.getId() + ".txt"
                    );

            writer.write("===== STUDENT REPORT =====\\n");
            writer.write("ID: " + student.getId() + "\\n");
            writer.write("Name: " + student.getName() + "\\n");
            writer.write("Department: " + student.getDepartment() + "\\n");
            writer.write("Email: " + student.getEmail() + "\\n");
            writer.write("Marks: " + student.getMarks() + "\\n");
            writer.write("Attendance: "
                    + student.getAttendance() + "%\\n");
            writer.write("Grade: "
                    + student.getGrade() + "\\n");

            writer.close();

            System.out.println(
                    "Report Generated Successfully"
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}