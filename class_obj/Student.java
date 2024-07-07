package class_obj;

public class Student{
	int age;
	String name,dept;
	
	public void getdata(int age,String n,String d) {
		this.age=age;
		name=n;
		dept=d;
	}
	
//	public Student(int a,String n,String d) {
//		age=a;
//		name=n;
//		dept=d;
//	}
	
	public void display() {
		System.out.println("name="+name+" age="+age+" dept="+dept);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		Student obj=new Student();
		obj.getdata(18, "sagnik", "dept");
		obj.display();
		System.out.println(obj.age);
	}
	
}