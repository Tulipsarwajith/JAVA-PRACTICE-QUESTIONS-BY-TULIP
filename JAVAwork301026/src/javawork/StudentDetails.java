package javawork;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Student Age: ");
            int age = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Student Course: ");
            String course = sc.nextLine();

            // Create FileWriter object
            FileWriter fw = new FileWriter("Student.txt");

            // Write student details into file
            fw.write("Student Name: " + name + "\n");
            fw.write("Student ID: " + id + "\n");
            fw.write("Student Age: " + age + "\n");
            fw.write("Student Course: " + course + "\n");

            // Close the file
            fw.close();

            System.out.println("\nStudent details saved successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
        }

        sc.close();
    }
}

