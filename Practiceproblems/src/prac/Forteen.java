package prac;

import java.util.Scanner;

public class Forteen {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==0||n==1)
		{
			System.out.println(n+"it is neither prime or composite");
			
		
		
		}
		else {
		 boolean flag = false;
		    for (int i = 2; i <= n / 2; ++i) {
		      // condition for nonprime number
		      if (n% i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.println(n+ " is a prime number.");
		    else
		      System.out.println(n+ " is not a prime number.");
		}
	   }  
}
