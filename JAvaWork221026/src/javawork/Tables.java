package javawork;
import java.util.Scanner;

public class Tables {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the table number : ");
		int t=sc.nextInt();
		
		for(int i=1;i<11;i++) {
			System.out.println(t+" x "+i+" = "+t*i);
		}
	}

}
