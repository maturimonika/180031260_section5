package Contructordemo;
class Employeee
{
	int eid;
	String name;
	int sal;
	Employeee()
	{
		System.out.println("Default cons");
	}
	Employeee(int eid,String name)
	{
		this.eid=eid;
		this.name=name;
		
		
	}
	Employeee(int eid,String name,int sal)
	{
		this.eid=eid;
		this.name=name;
		this.sal=sal;
		
		
	}
	
	void display()
	{
		System.out.println(eid);
		System.out.println("Name is"+" "+name);
		System.out.println("Salary is"+sal);
	}
}

public class Constructoeol {
	public static void main(String args[])
	{
		Employeee e2=new Employeee();
		e2.display();
		Employeee e1=new Employeee(1,"abc");
		e1.display();
		Employeee e3=new Employeee(2,"def",100000);
		e3.display();
		
		
	}

}
