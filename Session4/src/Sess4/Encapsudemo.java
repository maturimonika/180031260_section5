package Sess4;
class Employee
{
	private int eid;
	private String name;
	private int sal;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
}
public class Encapsudemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setEid(31260);
		e.setName("Monika");
		e.setSal(100000);
		System.out.println("emp id"+e.getEid());
		System.out.println("emp name"+e.getName());
		System.out.println("emp sal"+e.getSal());
		
		

	}

}
