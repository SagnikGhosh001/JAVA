package interfaceJava;
interface X{
	void m1();
	void m2();
	void m3();
}
interface Y extends X{
	void m4();
	void m1();
}
class Z1{
	public void m5() {
		System.out.println("m5");
	}
}
class Z extends Z1 implements Y{

	public void m1() {
		System.out.println("m1");
	}
	public void m2() {
		System.out.println("m2");
	}
	public void m3() {
		System.out.println("m3");
	}
	public void m4() {
		System.out.println("m4");
	}
}
public class Interface_demo2 {

	public static void main(String[] args) {
		Z z=new Z();
		z.m1();
		z.m2();
		z.m3();
		z.m4();
	}

}
