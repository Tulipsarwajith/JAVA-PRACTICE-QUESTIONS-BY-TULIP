package javawork;
import java.util.Scanner;

public class ResortBooking {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which tye of room you need to book : ");
		System.out.println("1.AC Room");
		System.out.println("2.Non-AC Room");
		
		int s = sc.nextInt();
		
		switch(s) {
		
		case 1:
			System.out.println("You selected AC rooms");
			System.out.println("Now you need to select the room package : ");
			System.out.println("1.For 1 day it is 1000");
			System.out.println("2.For 2 days it is 1800");
			
			int a = sc.nextInt();
			
			switch(a) {
			
			case 1:
				System.out.println("You have selected the one day Package with 1000Rs.");
				System.out.println("Congratulations");
				break;
				
			case 2:
				System.out.println("You have selected the two day package with 1800Rs.");
				System.out.println("Congratulations");
				break;
				
			default :
				System.out.println("enter the correct number to access the package");
				break;
			}
			break;
		case 2 :
			System.out.println("You selected Non-AC rooms");
			System.out.println("Now you need to select the room package : ");
			System.out.println("1.For 1 day it is 600");
			System.out.println("2.For 2 days it is 1100");
			
			int b = sc.nextInt();
			
			switch(b) {
			
			case 1:
				System.out.println("You have selected the one day Package with 600Rs.");
				System.out.println("Congratulations");
				break;
				
			case 2:
				System.out.println("You have selected the two day package with 1100Rs.");
				System.out.println("Congratulations");
				break;
				
			default :
				System.out.println("enter the correct number to access the package");
				break;
			}
			
			break;
			
		}
		
		
		
	}

}
