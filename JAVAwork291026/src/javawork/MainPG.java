package javawork;

import java.util.Scanner;

public class MainPG {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        PaymentGateway payment;
	        int choice;
	        double amount;

	        do {
	            System.out.println("\n===== PAYMENT GATEWAY =====");
	            System.out.println("1. Online Payment (UPI)");
	            System.out.println("2. Card Payment");
	            System.out.println("3. Exit");

	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            if (choice == 1 || choice == 2) {

	                System.out.print("Enter payment amount: Rs. ");
	                amount = sc.nextDouble();

	                if (amount <= 0) {
	                    System.out.println("Please enter a valid amount.");
	                } else {
	                    switch (choice) {

	                        case 1:
	                            payment = new OnlinePayment();
	                            payment.pay(amount);
	                            break;

	                        case 2:
	                            payment = new CardPayment();
	                            payment.pay(amount);
	                            break;
	                    }
	                }
	            }

	        } while (choice != 3);

	        sc.close();
	    }
	}


