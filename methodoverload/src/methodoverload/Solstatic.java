package methodoverload;
class Stu
{
	int id;
	String name;
	static String clg="klu";
	Stu(int sid,String n)
	{
		id=sid;
		name=n;
		
	}
	void display()
	{
		System.out.println("Stu id"+id);
		System.out.println("Stu name"+name);
		System.out.println("Stu college"+clg);
	}
	static
	{
		clg="KL UNIVERSITY";
	}
}
public class Solstatic {
	public static void main(String args[]) {
		Stu s=new Stu(101,"minny");
		s.display();
		
		
	}

}
