package class_obj;

public class Practice3 {
	int age,sem;
	String name;
	void setdata(int age,int sem,String name) {
		this.age=age;
		this.sem=sem;
		this.name=name;
	}
	void display() {
		System.out.println("name="+name+" sem="+sem+" age="+age);
	}
	public static void main(String[] args) {
		Practice3 p1=new Practice3();
		p1.setdata(18, 4, "Sanchita");
		p1.display();

	}

}
