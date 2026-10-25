package javawork;
import java.util.Scanner;

public class Calculator {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two numbers :");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		System.out.println("enter the number as per the given below instructions\n"
				+ "1 - Addition\n"
				+ "2 - Substraction\n"
				+ "3 - Multiplication\n"
				+ "4 - Division\n"
				+ "Now you can enter the number :\n" );
		
		int n = sc.nextInt();
		
				switch(n) {
				case 1:
					double c = a+b;
					System.out.println("The answer is "+c);
					break;
					
				case 2:
					double d = a-b;
					System.out.println("The answer is " +d);
					break;
				
				case 3:
					double e = a*b;
					System.out.println("The answer is "+e);
					break;
					
				case 4:
					double f = a/b;
					System.out.println("The answer is "+f);
					break;
					
				default:
					System.out.println("Enter the correct number between 1 to 4");
					break;
				}
			
		
	}
}

