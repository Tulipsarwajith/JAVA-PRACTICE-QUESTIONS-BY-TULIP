package javawork;
import java.util.Scanner;

public class LargestElementInArray {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n=sc.nextInt();
		System.out.println();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter the "+i+" index element : ");
			arr[i]=sc.nextInt();
			
			System.out.println();
			
		}
		
		int l=arr[0];
		
		for(int i=0;i<n;i++) {
			if( l < arr[i]) {
				l=arr[i];
			}
		}
		System.out.println("The largest numner in the array is : "+l);
	}

}
