package class_obj;

public class Practice7 {
	void method() {
		System.out.println("no arg");
	}
	void method(int a) {
		System.out.println("int");
	}
	void method(float a) {
		System.out.println("float");
	}
	void method(int a,float b) {
		System.out.println("int-float");
	}
	void method(float a,int b) {
		System.out.println("float-int");
	}
	public static void main(String[] args) {
		Practice7 p1=new Practice7();
		p1.method();
		p1.method(10);
		p1.method(1.1f);
		p1.method('b');
		p1.method(10,10.1f);
		p1.method(10.1f,10);
//		p1.method(10,10);
		//p1.method(10.1f,10.1f);
	}

}
