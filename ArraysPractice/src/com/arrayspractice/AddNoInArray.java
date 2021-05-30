package com.arrayspractice;

import java.util.Scanner;

public class AddNoInArray {

	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("how many values of an array....");
		int a=sc.nextInt();
		
	   int[] arr=new  int[a] ;
	  
	     System.out.println("enter values......");
	     for(int i=0;i<arr.length;i++)
	     {
	    	
	  	    	 arr[i]=sc.nextInt();
	  	    	
	     }	
	     int sum=0;
	     for(int i=0;i<arr.length;i++)
	     {
	    	 sum=sum+arr[i];
	     }       
	 System.out.println("sum of all values in an array:..."+sum);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
	}

}
