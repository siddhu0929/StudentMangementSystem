import auth.AdminLogin;
import dao.StudentDAO;
import model.Student;
import service.StudentService;
import util.ReportGenerator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT MANAGEMENT SYSTEM =====");

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (!AdminLogin.login(username, password)) {

            System.out.println("Invalid Login");
            return;
        }

        StudentService service = new StudentService();
        StudentDAO dao = new StudentDAO();

        while (true) {

            System.out.println("\\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Generate Report");
            System.out.println("6. Exit");

            System.out.print("Choose Option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    Student student = new Student();

                    System.out.print("Enter Name: ");
                    student.setName(sc.nextLine());

                    System.out.print("Enter Department: ");
                    student.setDepartment(sc.nextLine());

                    System.out.print("Enter Email: ");
                    student.setEmail(sc.nextLine());

                    System.out.print("Enter Marks: ");
                    student.setMarks(sc.nextDouble());

                    System.out.print("Enter Attendance: ");
                    student.setAttendance(sc.nextDouble());

                    service.addStudent(student);

                    break;

                case 2:

                    dao.viewStudents();

                    break;

                case 3:

                    System.out.print("Enter Student ID: ");

                    int id = sc.nextInt();

                    Student s = dao.searchStudent(id);

                    if (s != null) {

                        System.out.println("Name: " + s.getName());
                        System.out.println("Grade: " + s.getGrade());

                    } else {

                        System.out.println("Student Not Found");
                    }

                    break;

                case 4:

                    System.out.print("Enter Student ID: ");

                    int deleteId = sc.nextInt();

                    dao.deleteStudent(deleteId);

                    break;

                case 5:

                    System.out.print("Enter Student ID: ");

                    int reportId = sc.nextInt();

                    Student reportStudent =
                            dao.searchStudent(reportId);

                    if (reportStudent != null) {

                        ReportGenerator.generateReport(
                                reportStudent
                        );

                    } else {

                        System.out.println("Student Not Found");
                    }

                    break;

                case 6:

                    System.out.println("Exiting...");
                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}