package Contructordemo;
class Employee
{
	int eid;
	String name;
	int sal;
	Employee(int eid,String name,int sal)
	{
		this.eid=eid;
		this.name=name;
		this.sal=sal;
		
	}
	void display()
	{
		System.out.println(eid+" "+"Name is"+" "+name+" "+"Salary is"+sal);
	}
}

public class Employeedemo {
	public static void main(String args[])
	{
		Employee e1=new Employee(1,"abc",100000);
		e1.display();
		
		
	}

}
