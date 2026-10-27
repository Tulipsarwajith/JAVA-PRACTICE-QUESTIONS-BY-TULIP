package javawork;

import java.util.Scanner;

public class TempPatient {
public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no of Patients : ");
		
		System.out.println();
		int a=sc.nextInt();
		
		String pat[]=new String[a];
		
		for(int i=0;i<a;i++) {
			System.out.print("Enter the patient name : ");
			pat[i]=sc.next();
		}
		
		System.out.println();
		
		System.out.println("In a day how many times you want to check temparature : ");
		int b=sc.nextInt();
		
		System.out.println();
		
		String temp[]=new String[b];
		
		for(int i=0;i<b;i++) {
			System.out.print("Enter when you want to check the temperature : ");
			 temp[i]=sc.next();
			
		}
		System.out.println();
		
		double check[][]=new double[a][b];
		System.out.println("Enter the temparature of the patients for each time : ");
		System.out.println();
		
		double checktemp;
		
		for(int i=0;i<a;i++) {
			checktemp=0;
			for(int j=0;j<b;j++) {
				System.out.print("Enter the "+pat[i]+" temparature at "+temp[j]+" time : ");
				check[i][j]=sc.nextDouble();
				System.out.println();
				checktemp=check[i][j];
				
				if(checktemp<100) {
					System.out.println("You have no fever and you can go ");
					System.out.println();
					break;
					
				}else {
					System.out.println("Still you need to take rest in hospital");
					System.out.println();
				}
				
			}
		}
		
		
	}

}
