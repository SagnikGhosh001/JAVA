package class_obj;

public class Practice5 {
	int age,sem;
	String name;
	public Practice5(int age,int sem, String name) {
		this.age=age;
		this.sem=sem;
		this.name=name;
	}
	void display() {
		System.out.println("name="+name+" sem="+sem+" age="+age);
	}
	public static void main(String[] args) {
		Practice5 p1=new Practice5(18, 4, "sanchita");
		p1.display();
	}

}
