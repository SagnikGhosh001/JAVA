package class_obj;

public class Employee {
	
	
	int empid=101;
	String name="sagnik",gender="male";
	

	public void getdata(int e, String n,String g) {
		empid=e;
		name=n;
		gender=g;
	}
	
	public void display() {
		System.out.println("empid="+empid+" name="+name+" gender="+gender);
	}
	
	public static void main(String[] args) {
		Employee sanchita=new Employee();
		sanchita.getdata(100, "sanchita", "male");
		sanchita.display();
		System.out.println(sanchita.empid);
	}
}