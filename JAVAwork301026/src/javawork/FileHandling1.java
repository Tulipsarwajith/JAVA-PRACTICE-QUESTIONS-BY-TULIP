package javawork;


import java.io.File;
import java.io.IOException;

public class FileHandling1 {

    public static void main(String[] args) {

        try {

            // Create a File object
            File f = new File("Tulip.txt");

            // Create the file
            if (f.createNewFile()) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists!");
            }

            // Check whether file exists
            if (f.exists()) {
                System.out.println("File exists.");

                System.out.println("File Name: " + f.getName());

                System.out.println("File Location: " + f.getAbsolutePath());
            } else {
                System.out.println("File does not exist.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}

