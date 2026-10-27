package javawork;
import java.util.Scanner;

public class EmployeeSalary {
public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no of employees : ");
		
		System.out.println();
		int a=sc.nextInt();
		
		String emp[]=new String[a];
		
		for(int i=0;i<a;i++) {
			System.out.print("Enter the "+i+" employee name : ");
			emp[i]=sc.next();
		}
		
		System.out.println();
		
		System.out.println("Enter no of months : ");
		int b=sc.nextInt();
		
		System.out.println();
		
		String mon[]=new String[b];
		
		for(int i=0;i<b;i++) {
			System.out.print("Enter the "+i+" month name : ");
			 mon[i]=sc.next();
			
		}
		System.out.println();
		
		int salary[][]=new int[a][b];
		System.out.println("Enter the salary of the employees for each month : ");
		System.out.println();
		
		int total;
		
		double avg[]=new double[a];
		
		
		for(int i=0;i<a;i++) {
			total=0;
			for(int j=0;j<b;j++) {
				System.out.print("Enter the "+emp[i]+" salary of the "+mon[j]+" month : ");
				salary[i][j]=sc.nextInt();
				total=total+salary[i][j];
			}
			System.out.println();
			System.out.print("total marks of "+emp[i]+" is : "+total);
			avg[i]=total/b;
			
			System.out.println();
			
			System.out.print("The Average marks of "+emp[i]+" is : "+avg[i]);
			
			System.out.println(); 
		}
		
		System.out.println();
		
		double high=avg[0];
		
		for(int i=1;i<avg.length;i++) {
			if(avg[i]>high) {
				high=avg[i];
			}
		}
		
		for(int i=0;i<avg.length;i++) {
			if(high==avg[i]) {
				System.out.print("the highest paid employee is "+emp[i]+
						" and the Average salary per month is :"+high);
			}
		}
		
		System.out.println();
		
        double low=avg[0];
		
		for(int i=1;i<avg.length;i++) {
			if(avg[i]<low) {
				low=avg[i];
			}
		}
		
		for(int i=0;i<avg.length;i++) {
			if(low==avg[i]) {
				System.out.print("the lowest paid employee is "+emp[i]+
						" and the Average salary per month is :"+low);
			}
		}
		
		
	}


}
