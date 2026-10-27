package javawork;
import java.util.Scanner;

public class StudentSubjects {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no of students : ");
		
		System.out.println();
		int a=sc.nextInt();
		
		String stu[]=new String[a];
		
		for(int i=0;i<a;i++) {
			System.out.print("Enter the "+i+" student name : ");
			stu[i]=sc.next();
		}
		
		System.out.println();
		
		System.out.println("Enter no of Subjects : ");
		int b=sc.nextInt();
		
		System.out.println();
		
		String sub[]=new String[b];
		
		for(int i=0;i<b;i++) {
			System.out.print("Enter the "+i+" subject name : ");
			 sub[i]=sc.next();
			
		}
		System.out.println();
		
		int marks[][]=new int[a][b];
		System.out.println("Enter the marks of the students for each subject : ");
		System.out.println();
		
		int total;
		
		double avg[]=new double[a];
		
		char Grade;
		
		for(int i=0;i<a;i++) {
			total=0;
			for(int j=0;j<b;j++) {
				System.out.print("Enter the "+stu[i]+" marks of the "+sub[j]+" subject : ");
				marks[i][j]=sc.nextInt();
				total=total+marks[i][j];
			}
			System.out.println();
			System.out.print("total marks of "+stu[i]+" is : "+total);
			avg[i]=total/b;
			
			System.out.println();
			
			System.out.print("The Average marks of "+stu[i]+" is : "+avg[i]);
			
			System.out.println(); 
			
			
			if(90<avg[i] && avg[i]<=100) {
				 Grade='A';
				 System.out.println(stu[i]+" got "+Grade+" Grade");
			}else if(80<avg[i]&&avg[i]<=90) {
				Grade='B';
				System.out.println(stu[i]+" got "+Grade+" Grade");
			}else if(70<avg[i]&&avg[i]<=80) {
				Grade='C';
				System.out.println(stu[i]+" got "+Grade+" Grade");
			}else if(50<avg[i]&&avg[i]<=70) {
				Grade='D';
				System.out.println(stu[i]+" got "+Grade+" Grade");
			}else {
				Grade='E';
				System.out.println(stu[i]+" got "+Grade+" Grade");
			}
			
			
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
				System.out.print("the highest average score by "+stu[i]+" is :"+high);
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
				System.out.print("the lowest average score by "+stu[i]+" is :"+low);
			}
		}
		
		
	}

}
