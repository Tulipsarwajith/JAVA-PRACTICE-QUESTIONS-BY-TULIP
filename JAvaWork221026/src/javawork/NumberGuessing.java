package javawork;
import java.util.Scanner;

public class NumberGuessing {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		
		System.out.println();
		
		int n= sc.nextInt();
		int count=3;
		
		do {
			System.out.print("Enter any number to guess ");
			int a=sc.nextInt();
			count--;
			
			if(a!=n) {
				System.out.println("You guessed wrong and you have "+count+" chances");
				if(count==0) {
					System.out.println("Now your all chances are over so "
							+ "you need to run the program again");
				}
			}else {
				System.out.println("You guessed correct, congratulations");
				break;
			}
		}while(count>0);
		
	}

}
