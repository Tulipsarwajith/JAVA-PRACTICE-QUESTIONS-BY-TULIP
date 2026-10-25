package javawork;
import java.util.Scanner;

public class Primenoornot {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		
		int n=sc.nextInt();
		boolean isprime=false;
		int r=2;
		
		while(n>r) {
			
			if(n%r==0) {
				isprime=true;
				break;
			}else {
				isprime=false;
			}
			
			r++;
		}
		if(isprime) {
			System.out.println("Not prime number");
		}else {
			System.out.println("Prime NUmber");
		}
		}
	}


