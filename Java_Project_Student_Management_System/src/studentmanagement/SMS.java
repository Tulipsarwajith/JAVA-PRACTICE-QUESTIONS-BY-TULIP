package studentmanagement;
import java.util.*;
import java.io.*;

public class SMS {

    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, Student> students = new HashMap<>();
    static String fileName = "students.txt";

    // Enum
    enum StudentStatus {
        ACTIVE, INACTIVE, COMPLETED
    }

    // Course class
    static class Course {
        private int courseId;
        private String courseName;

        Course(int courseId, String courseName) {
            this.courseId = courseId;
            this.courseName = courseName;
        }

        int getCourseId() {
            return courseId;
        }

        String getCourseName() {
            return courseName;
        }
    }

    // Student class
    static class Student {
        private int id;
        private String name;
        private String email;
        private double marks;
        private int attendance;
        private StudentStatus status;
        private Course course;

        Student(int id, String name, String email, double marks,
                int attendance, StudentStatus status, Course course) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.marks = marks;
            this.attendance = attendance;
            this.status = status;
            this.course = course;
        }

        int getId() {
            return id;
        }

        String getName() {
            return name;
        }

        String getEmail() {
            return email;
        }

        double getMarks() {
            return marks;
        }

        int getAttendance() {
            return attendance;
        }

        StudentStatus getStatus() {
            return status;
        }

        Course getCourse() {
            return course;
        }

        void setMarks(double marks) {
            this.marks = marks;
        }

        void setAttendance(int attendance) {
            this.attendance = attendance;
        }
    }

    // Validate marks
    static void validateMarks(double marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException(
                "Marks must be between 0 and 100!");
        }
    }

    // Validate attendance
    static void validateAttendance(int attendance) {
        if (attendance < 0 || attendance > 100) {
            throw new IllegalArgumentException(
                "Attendance must be between 0 and 100!");
        }
    }

    // Add student
    static void addStudent() {

        System.out.print("Enter Student ID: ");
        int id = Integer.parseInt(sc.nextLine());

        if (students.containsKey(id)) {
            throw new IllegalArgumentException("Student ID already exists!");
        }

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = Double.parseDouble(sc.nextLine());
        validateMarks(marks);

        System.out.print("Enter Attendance: ");
        int attendance = Integer.parseInt(sc.nextLine());
        validateAttendance(attendance);

        System.out.print("Enter Status (ACTIVE/INACTIVE/COMPLETED): ");
        StudentStatus status = StudentStatus.valueOf(
            sc.nextLine().trim().toUpperCase());

        System.out.print("Enter Course ID: ");
        int courseId = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Course Name: ");
        String courseName = sc.nextLine();

        Course course = new Course(courseId, courseName);

        Student student = new Student(id, name, email, marks,
                attendance, status, course);

        students.put(id, student);

        System.out.println("Student added successfully!");
    }

    // Display student details
    static void displayStudent(Student s) {

        System.out.println("\nStudent ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("Email: " + s.getEmail());
        System.out.println("Marks: " + s.getMarks());
        System.out.println("Attendance: " + s.getAttendance() + "%");
        System.out.println("Status: " + s.getStatus());
        System.out.println("Course ID: " + s.getCourse().getCourseId());
        System.out.println("Course: " + s.getCourse().getCourseName());
    }

    // Display all students
    static void displayAllStudents() {

        if (students.isEmpty()) {
            System.out.println("No students available!");
            return;
        }

        for (Student s : students.values()) {
            displayStudent(s);
        }
    }

    // Search student by ID
    static Student searchById(int id) {

        Student s = students.get(id);

        if (s == null) {
            throw new IllegalArgumentException("Student not found!");
        }

        return s;
    }

    // Search student by name
    static void searchByName(String name) {

        boolean found = false;

        for (Student s : students.values()) {
            if (s.getName().equalsIgnoreCase(name)) {
                displayStudent(s);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Student not found!");
        }
    }

    // Update marks
    static void updateMarks() {

        System.out.print("Enter Student ID: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Enter New Marks: ");
        double marks = Double.parseDouble(sc.nextLine());

        validateMarks(marks);
        searchById(id).setMarks(marks);

        System.out.println("Marks updated successfully!");
    }

    // Update attendance
    static void updateAttendance() {

        System.out.print("Enter Student ID: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Enter New Attendance: ");
        int attendance = Integer.parseInt(sc.nextLine());

        validateAttendance(attendance);
        searchById(id).setAttendance(attendance);

        System.out.println("Attendance updated successfully!");
    }

    // Calculate grade
    static void calculateGrade() {

        System.out.print("Enter Student ID: ");
        int id = Integer.parseInt(sc.nextLine());

        Student s = searchById(id);
        double marks = s.getMarks();

        String grade;

        if (marks >= 90)
            grade = "A+";
        else if (marks >= 80)
            grade = "A";
        else if (marks >= 70)
            grade = "B";
        else if (marks >= 60)
            grade = "C";
        else if (marks >= 50)
            grade = "D";
        else
            grade = "F";

        System.out.println("Student Name: " + s.getName());
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    // Remove student
    static void removeStudent() {

        System.out.print("Enter Student ID: ");
        int id = Integer.parseInt(sc.nextLine());

        if (students.remove(id) == null) {
            throw new IllegalArgumentException("Student not found!");
        }

        System.out.println("Student removed successfully!");
    }

    // Display topper
    static void displayTopper() {

        if (students.isEmpty()) {
            System.out.println("No students available!");
            return;
        }

        Student topper = null;

        for (Student s : students.values()) {
            if (topper == null || s.getMarks() > topper.getMarks()) {
                topper = s;
            }
        }

        System.out.println("\n------ Student Topper ------");
        displayStudent(topper);
    }

    // Save student details
    static void saveStudents() throws IOException {

        BufferedWriter writer = new BufferedWriter(
            new FileWriter(fileName));

        for (Student s : students.values()) {

            String data = s.getId() + "|" +
                    s.getName() + "|" +
                    s.getEmail() + "|" +
                    s.getMarks() + "|" +
                    s.getAttendance() + "|" +
                    s.getStatus() + "|" +
                    s.getCourse().getCourseId() + "|" +
                    s.getCourse().getCourseName();

            writer.write(data);
            writer.newLine();
        }

        writer.close();

        System.out.println("Student details saved successfully!");
    }

    // Load student details
    static void loadStudents() throws IOException {

        HashMap<Integer, Student> loaded = new HashMap<>();

        BufferedReader reader = new BufferedReader(
            new FileReader(fileName));

        String line;

        while ((line = reader.readLine()) != null) {

            String[] data = line.split("\\|", -1);

            if (data.length != 8) {
                System.out.println("Skipping invalid record: " + line);
                continue;
            }

            int id = Integer.parseInt(data[0]);
            String name = data[1];
            String email = data[2];
            double marks = Double.parseDouble(data[3]);
            int attendance = Integer.parseInt(data[4]);
            StudentStatus status = StudentStatus.valueOf(data[5]);
            int courseId = Integer.parseInt(data[6]);
            String courseName = data[7];

            Course course = new Course(courseId, courseName);

            Student s = new Student(id, name, email, marks,
                    attendance, status, course);

            loaded.put(id, s);
        }

        reader.close();

        students.clear();
        students.putAll(loaded);

        System.out.println("Student details loaded successfully!");
    }

    // Main method
    public static void main(String[] args) {

        try {
            loadStudents();
        } catch (IOException e) {
            System.out.println("No previous student file found. Starting fresh.");
        }

        int choice = 0;

        do {
            try {
                System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
                System.out.println("1. Add Student");
                System.out.println("2. Display All Students");
                System.out.println("3. Search Student By ID");
                System.out.println("4. Search Student By Name");
                System.out.println("5. Update Student Marks");
                System.out.println("6. Update Attendance");
                System.out.println("7. Calculate Grade");
                System.out.println("8. Remove Student");
                System.out.println("9. Display Topper");
                System.out.println("10. Save Student Details");
                System.out.println("11. Load Student Details");
                System.out.println("12. Exit");

                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    case 1:
                        addStudent();
                        break;

                    case 2:
                        displayAllStudents();
                        break;

                    case 3:
                        System.out.print("Enter Student ID: ");
                        int id = Integer.parseInt(sc.nextLine());
                        displayStudent(searchById(id));
                        break;

                    case 4:
                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();
                        searchByName(name);
                        break;

                    case 5:
                        updateMarks();
                        break;

                    case 6:
                        updateAttendance();
                        break;

                    case 7:
                        calculateGrade();
                        break;

                    case 8:
                        removeStudent();
                        break;

                    case 9:
                        displayTopper();
                        break;

                    case 10:
                        saveStudents();
                        break;

                    case 11:
                        loadStudents();
                        break;

                    case 12:
                        saveStudents();
                        System.out.println("Thank you for using Student Management System!");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (IOException e) {
                System.out.println("File Error: " + e.getMessage());

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter correct details.");
            }

        } while (choice != 12);

        sc.close();
    }
}
