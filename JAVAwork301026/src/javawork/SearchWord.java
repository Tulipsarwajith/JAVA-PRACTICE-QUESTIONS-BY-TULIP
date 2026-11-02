package javawork;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SearchWord {

    public static void main(String[] args) {

        String searchWord = "JAVA";
        boolean found = false;

        try {

            File f = new File("Student.txt");
            FileReader fr = new FileReader(f);

            StringBuilder content = new StringBuilder();

            int ch;

            while ((ch = fr.read()) != -1) {
                content.append((char) ch);
            }

            fr.close();

            String data = content.toString();

            if (data.contains(searchWord)) {
                found = true;
            }

            if (found) {
                System.out.println(searchWord + " found in the file");
            } else {
                System.out.println(searchWord + " not found in the file");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

