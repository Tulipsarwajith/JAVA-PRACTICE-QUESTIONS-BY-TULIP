package javawork;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		
		int n = sc.nextInt();
		
		int o=n;
		int rev=0;
		
		while(n>0) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(o==rev) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("It is not palindrome");
		}
	}

}
