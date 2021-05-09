package prac;

import java.util.Scanner;

public class Twentyseven {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		sum:
		for (int i = 0; i < n; i++) {
		    if (a[i] == 6) {
		        for (int j = i + 1; j < n; j++) {
		            if (a[j] == 7) {
		                i = j;
		                continue sum;
		            }
		        }
		    }
		    s += a[i];
		}

		System.out.println(s);
	}

}
