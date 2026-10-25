package javawork;
import java.util.Scanner;

public class SumOfArrayElements {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n=sc.nextInt();
		System.out.println();
		
		int total=0;
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter the "+i+" index element : ");
			arr[i]=sc.nextInt();
		
			total=total+arr[i];
		}
		
		System.out.println("Sum of all the array elements : "+total);
		
	}

}
