package javawork;


import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EvenOddFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("How many numbers do you want to enter? ");
            int n = sc.nextInt();

            FileWriter evenFile = new FileWriter("EvenNumbers.txt");
            FileWriter oddFile = new FileWriter("OddNumbers.txt");

            for (int i = 1; i <= n; i++) {

                System.out.print("Enter number " + i + ": ");
                int number = sc.nextInt();

                if (number % 2 == 0) {
                    evenFile.write(number + "\n");
                }
                else {
                    oddFile.write(number + "\n");
                }
            }

            evenFile.close();
            oddFile.close();

            System.out.println("\nNumbers separated successfully!");

            // Reading even numbers
            FileReader fr1 = new FileReader("EvenNumbers.txt");

            int ch;

            System.out.println("\n--- Even Numbers ---");

            while ((ch = fr1.read()) != -1) {
                System.out.print((char) ch);
            }

            fr1.close();

            // Reading odd numbers
            FileReader fr2 = new FileReader("OddNumbers.txt");

            System.out.println("\n--- Odd Numbers ---");

            while ((ch = fr2.read()) != -1) {
                System.out.print((char) ch);
            }

            fr2.close();

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

