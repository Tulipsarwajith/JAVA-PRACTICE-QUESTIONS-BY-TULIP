package javawork;



import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // Taking student details
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter student ID: ");
            int id = sc.nextInt();

            // Taking subject marks
            System.out.print("Enter Java marks: ");
            int java = sc.nextInt();

            System.out.print("Enter SQL marks: ");
            int sql = sc.nextInt();

            System.out.print("Enter Python marks: ");
            int python = sc.nextInt();

            // Calculating total and percentage
            int total = java + sql + python;

            double percentage = total / 3.0;

            // Grade calculation
            String grade;

            if (percentage >= 90) {
                grade = "A+";
            }
            else if (percentage >= 80) {
                grade = "A";
            }
            else if (percentage >= 70) {
                grade = "B";
            }
            else if (percentage >= 60) {
                grade = "C";
            }
            else if (percentage >= 50) {
                grade = "D";
            }
            else {
                grade = "Fail";
            }

            // Writing details into file
            FileWriter fw = new FileWriter("StudentMarks.txt");

            fw.write("Student Name: " + name + "\n");
            fw.write("Student ID: " + id + "\n");
            fw.write("Java Marks: " + java + "\n");
            fw.write("SQL Marks: " + sql + "\n");
            fw.write("Python Marks: " + python + "\n");
            fw.write("Total Marks: " + total + "/300\n");
            fw.write("Percentage: " + percentage + "%\n");
            fw.write("Grade: " + grade + "\n");

            fw.close();

            System.out.println("\nStudent details saved successfully!");

            // Reading details from file
            FileReader fr = new FileReader("StudentMarks.txt");

            int ch;

            System.out.println("\n--- Student Result ---");

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
