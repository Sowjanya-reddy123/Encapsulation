import java.util.Scanner;

public class Student {
    private String StudentId;
    private String StudentName;
    private double grade;


    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade >= 0.0 && grade <= 100.0) {
            this.grade = grade;
        }
    }

}

class GradeManagementApp {
    private Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        Student student = new Student();

        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();
        student.setStudentId(studentID);

        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();
        student.setStudentName(studentName);

        System.out.print("Enter Grade: ");
        double grade = scanner.nextDouble();
        student.setGrade(grade);

    }

    // Method to display student information
    public void displayStudentInfo(Student student) {
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Grade: " + student.getGrade());
    }

    public static void main(String[] args) {
        GradeManagementApp app = new GradeManagementApp();
        app.addStudent();
    }
}