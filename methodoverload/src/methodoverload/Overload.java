package methodoverload;

public class Overload {
	void add()
	{
		System.out.println("no parameters");
	}
	void add(int a)
	{
		System.out.println(a);
	}
	int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	float add(float a,float b)
	{
		float e=a+b;
		return e;
	}}
	class Solution
	{
		public static void main(String args[])
		{
			Overload o1=new Overload();
			o1.add();
			o1.add(9);
			int m=o1.add(81,9);
			System.out.println(m);
			float k=o1.add(9.5f,4.0f);
			System.out.println(k);
			
			
			
			
					
			
		}
	}
	


