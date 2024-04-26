package class_obj;

public class Practice1 {
	static void display1() {
		System.out.println("this is static");
	}
	void display2() {
		System.out.println("not static");
	}
	public static void main(String[] args) {
		Practice1 p1=new Practice1();
		Practice1.display1();
		p1.display2();
	}

}
