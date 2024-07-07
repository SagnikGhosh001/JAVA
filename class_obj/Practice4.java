package class_obj;

public class Practice4 {
	
	int a=10;
	
	void test() {
		int a=17;
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		Practice4 p1=new Practice4();
		p1.test();
	}

}