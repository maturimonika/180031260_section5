package Student;

public class Student {
	int  sid;
	String sname;
	int marks;
	void setAssign(int sid,String sname,int marks)
	{
		this.sid=sid;
		this.sname=sname;
		this.marks=marks;
	}
	void display()
	{
		System.out.println("Student name:"+ sname);
		System.out.println("Student id:"+ sid);
		System.out.println("Studentmarks:"+ marks);
	}

}
