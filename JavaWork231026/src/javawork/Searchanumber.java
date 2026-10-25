package javawork;

import java.util.Scanner;

public class Searchanumber {
public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array :");
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println();
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter the "+i+" index element : ");
			arr[i]=sc.nextInt();
		}
		System.out.println();
		System.out.print("Enter the number you want to"
				+ " search its index position :");
		
		
		int a=sc.nextInt();
		
		System.out.println();
		
	    for(int i=0;i<n;i++) {
	    	if(a==arr[i]) {
	    		System.out.println("Congratulations");
	    		System.out.println("Your number is found at index position : "+i);
	    	}else {
	    		continue;
	    	}
	    }

}
}
