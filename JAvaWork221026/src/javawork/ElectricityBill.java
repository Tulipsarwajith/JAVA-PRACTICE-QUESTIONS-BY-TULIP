package javawork;
import java.util.Scanner;

public class ElectricityBill {
	public static void main(String[]args) {
		
	Scanner sc  =  new Scanner (System.in);	
	
	System.out.println("Enter the 6 months electricity bill : ");
	System.out.println();
	
	int total=0;
	
	for(int i=1;i<=6;i++) {
		System.out.print("Enter the "+i+" month electricity bill : ");
		int a=sc.nextInt();
		System.out.println();
		total=total+a;
	}
	
	System.out.println("Total 6 months electricity bill : "+total);
	}

}
