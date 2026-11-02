package javawork;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountCharacters {

    public static void main(String[] args) {

        int characters = 0;
        int spaces = 0;
        int digits = 0;

        try {

            File f = new File("Student.txt");

            FileReader fr = new FileReader(f);

            int ch;

            while ((ch = fr.read()) != -1) {

                characters++;

                if (ch == ' ') {
                    spaces++;
                }

                if (ch >= '0' && ch <= '9') {
                    digits++;
                }
            }

            fr.close();

            System.out.println("Total Characters: " + characters);
            System.out.println("Total Spaces: " + spaces);
            System.out.println("Total Digits: " + digits);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}

