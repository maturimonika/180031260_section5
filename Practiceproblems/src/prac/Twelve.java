package prac;

import java.util.Scanner;

public class Twelve {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		 if (n <= 1) {  
	           System.out.println("Select>1");
	       }  
	       for (int i = 2; i <= Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	        	   c++;
	           } }
	       if(c>0)
	       {
	    	   System.out.println("No");
	       }
	           else
	           {
	        	   System.out.println("Yes");
	           }
	       
	       	        
	   }  
	}

