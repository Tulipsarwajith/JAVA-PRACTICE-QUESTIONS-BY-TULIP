package javawork;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendFile {

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

            // Open file in append mode
            FileWriter fw = new FileWriter("Student.txt", true);

            // Append student details
            fw.write("\nStudent Name: " + name);
            fw.write("\nStudent ID: " + id);
            fw.write("\nStudent Age: " + age);
            fw.write("\nStudent Course: " + course);
            fw.write("\n----------------------");

            fw.close();

            System.out.println("\nStudent details appended successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
        }

        sc.close();
    }
}

