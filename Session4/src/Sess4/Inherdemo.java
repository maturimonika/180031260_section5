package Sess4;
class Person
{
	int id;
	String n;
	Person(int id,String n)
	{
		this.id=id;
		this.n=n;
	}
	void display()
	{
		System.out.println("pid "+id+" name "+n);
		
	}
}
class Student extends Person
{
	String add;
	Student(int id,String n,String add)
	{
		super(id,n);
		this.add=add;
		
	}
	void show()
	{
		System.out.println("pid "+id+" name "+n+" address "+add);
	}
}
public class Inherdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(101,"abc","Nizamabad");
		s.show();

	}

}
