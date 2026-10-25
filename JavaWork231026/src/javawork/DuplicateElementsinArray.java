package javawork;
import java.util.Scanner;

public class DuplicateElementsinArray {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        
        int[]arr=new int[n];
        
        System.out.println();
        
        System.out.println("Enter the values :  ");
        
        System.out.println();
        
        for(int i=0;i<n;i++) {
        	System.out.print("Enter the value at index "+i+" : ");
        	arr[i]=sc.nextInt();
        	
        }
        
        for(int i=0;i<arr.length;i++) {
        	int count=1;
        	int alreadyCounted=0;
        	
        	for(int k=0;k<i;k++) {
        		if(arr[i]==arr[k]) {
        			alreadyCounted=1;
        			break;
        		}
        	}
        	
        	if(alreadyCounted==1) {
        		continue;
        	}
        	
        	for(int j=i+1;j<arr.length;j++) {
        		if(arr[i]==arr[j]) {
        			count++;
        		}
        		
        	}
        	System.out.println(arr[i]+" appeard "+count+" times ");
        }
	}
}