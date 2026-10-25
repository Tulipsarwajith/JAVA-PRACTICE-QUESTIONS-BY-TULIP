package javawork;
import java.util.Scanner;

public class MatrixADDandSUB {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first matrix details : ");
		
		System.out.println();
		
		int arr1[][]=new int[2][2];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				
				System.out.println("enter the number of "+i+j+" :");
				arr1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("So the first matrx is : ");
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Enter the second matrix details :");
		System.out.println();
		
int arr2[][]=new int[2][2];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				
				System.out.println("enter the number of "+i+j+" :");
				arr2[i][j]=sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("So the Second matrx is : ");
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int arr3[][]=new int[2][2];
		
	     
	     System.out.println();
	     
	     System.out.println("So the added matrix is : ");
	     
	     for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					arr3[i][j]=arr1[i][j]+arr2[i][j];
				}
			}
	     
	     for(int i=0;i<2;i++) {
	    	 for(int j=0;j<2;j++) {
	    		 System.out.print(arr3[i][j]+" ");
	    	 }
	    	 System.out.println();
	     }
	     
System.out.println();
	     
	     System.out.println("So the Subtracted matrix is : ");
	     
	     int arr4[][]=new int[2][2];
	     
	     for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					arr4[i][j]=arr1[i][j]-arr2[i][j];
				}
			}
	     
	     for(int i=0;i<2;i++) {
	    	 for(int j=0;j<2;j++) {
	    		 System.out.print(arr4[i][j]+" ");
	    	 }
	    	 System.out.println();
	     }

	     
	     
	}

}
