package javawork;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LongestWord {

    public static void main(String[] args) {

        String longestWord = "";

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

            String[] words = data.split("\\s+");

            for (String word : words) {

                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            System.out.println("Longest word: " + longestWord);
            System.out.println("Length: " + longestWord.length());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
