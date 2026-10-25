package javawork;
import java.util.Scanner;

public class ATM {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int bb =10000;
		
		System.out.println("You have the bank balance of 10000Rs");
		System.out.println("you can deposit or withdraw by pressing number 1 or 2");
		
		int a = sc.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("You had selected to deposit the amount");
			int b = sc.nextInt();
			int bb1=bb+b;
			System.out.println("Now your Bank balance is :"+bb1+"Rs.");
			break;
			
		case 2:
			System.out.println("You had selected to withdraw amount");
			int c = sc.nextInt();
			if(bb>c) {
				int bb2=bb-c;
				System.out.println("Now you r bank balance is "+bb2+"Rs.");
			}else {
				System.out.println("you don't have enough bank balance to withdraw");
			}
			break;
			
		default:
			System.out.println("Enter the correct number for accessing");
			break;
		}
		
	}

}
