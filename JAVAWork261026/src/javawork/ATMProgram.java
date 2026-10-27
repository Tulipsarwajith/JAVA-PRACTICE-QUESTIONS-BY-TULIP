package javawork;

import java.util.Scanner;

public class ATMProgram {

    double balance = 1000.0;

    void showBalance() {
        System.out.println("Your bank balance is: Rs. " + balance);
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully!");
            System.out.println("Updated balance: Rs. " + balance);
        } else {
            System.out.println("Please enter a valid amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully!");
            System.out.println("Remaining balance: Rs. " + balance);
        } else if (amount <= 0) {
            System.out.println("Please enter a valid amount.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ATMProgram atm = new ATMProgram();

        int choice;
        double amount;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Show Bank Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    atm.showBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: Rs. ");
                    amount = sc.nextDouble();
                    atm.deposit(amount);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: Rs. ");
                    amount = sc.nextDouble();
                    atm.withdraw(amount);
                    break;

                case 4:
                    System.out.println("Thank you for using our ATM!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        
    }
}
