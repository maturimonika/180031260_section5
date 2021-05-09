package methodoverload;

public class eg2 {
	eg2()
	{
		System.out.println("cons");
	}
	static
	{
		System.out.println("static block 3");
	}
	static void show()
	{
		System.out.println("Static method");
	}
	static
	{
		System.out.println("static block 1");
	}
	public static void main(String args[])
	{
		System.out.println("Main method");
		eg2 e1=new eg2();
		eg2.show();}
		static
		{
			System.out.println("static 2");
		}
	}
	


