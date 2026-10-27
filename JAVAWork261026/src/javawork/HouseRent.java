package javawork;


import java.util.Scanner;

public class HouseRent {

    
    void oneBHK(String name, int months) {
        int rent = 5000;
        int total = rent * months;

        System.out.println("\n===== RENT DETAILS =====");
        System.out.println("Customer Name: " + name);
        System.out.println("House Type: 1BHK");
        System.out.println("Monthly Rent: Rs. " + rent);
        System.out.println("Number of Months: " + months);
        System.out.println("Total Rent: Rs. " + total);
    }

    
    void twoBHK(String name, int months) {
        int rent = 8000;
        int total = rent * months;

        System.out.println("\n===== RENT DETAILS =====");
        System.out.println("Customer Name: " + name);
        System.out.println("House Type: 2BHK");
        System.out.println("Monthly Rent: Rs. " + rent);
        System.out.println("Number of Months: " + months);
        System.out.println("Total Rent: Rs. " + total);
    }

    
    void lease(String name, int months) {
        int rent = 3000;
        int total = rent * months;

        System.out.println("\n===== RENT DETAILS =====");
        System.out.println("Customer Name: " + name);
        System.out.println("House Type: Lease");
        System.out.println("Monthly Rent: Rs. " + rent);
        System.out.println("Number of Months: " + months);
        System.out.println("Total Amount: Rs. " + total);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HouseRent house = new HouseRent();

        String name;
        int choice;
        int months;

        do {
            System.out.println("\n===== HOUSE RENT MENU =====");
            System.out.println("1. 1BHK - Rs. 5000 per month");
            System.out.println("2. 2BHK - Rs. 8000 per month");
            System.out.println("3. Lease - Rs. 3000 per month");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice >= 1 && choice <= 3) {

                System.out.print("Enter your name: ");
                name = sc.nextLine();

                System.out.print("Enter number of months: ");
                months = sc.nextInt();

                if (months <= 0) {
                    System.out.println("Please enter a valid number of months.");
                } else {
                    switch (choice) {
                        case 1:
                            house.oneBHK(name, months);
                            break;

                        case 2:
                            house.twoBHK(name, months);
                            break;

                        case 3:
                            house.lease(name, months);
                            break;
                    }
                }
            }

        } while (choice != 4);

        sc.close();
    }
}

