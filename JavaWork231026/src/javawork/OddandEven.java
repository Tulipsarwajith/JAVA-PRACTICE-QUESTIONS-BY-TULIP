package javawork;

import java.util.Scanner;

public class OddandEven {
public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array :");
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the "+i+" index element : ");
			arr[i]=sc.nextInt();
		}
		
		int countofeven=0;
		int countofodd=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				countofeven+=1;
			}else {
				countofodd+=1;
			}
		}
		
		
		System.out.println("count of even numbers :"+countofeven);
		System.out.println("count of odd numbers : "+countofodd);
		System.out.println();
		
		System.out.println("Even numbers : ");
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				
				System.out.print(arr[i]+" ");
					
				}
			}
		
		System.out.println();
		System.out.println();
		System.out.println("odd numbers : ");
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0) {
				
				System.out.print(arr[i]+" ");
					
				}
				
				
			}
		}
}

