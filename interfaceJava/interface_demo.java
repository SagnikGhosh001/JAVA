package interfaceJava;

interface A1{
	void m1();
	void m2();
	void m3();
}
abstract class B1 implements A1{
	public void m1() {
		System.out.println("m1");
	}
	public void m2() {
		System.out.println("m2");
	}
}
class C1 extends B1{

	
	public void m3() {
		System.out.println("m3");
		
	}
	
} 
public class interface_demo {

	public static void main(String[] args) {
		C1 c=new C1();
		c.m1();
		c.m2();
		c.m3();
	}

}
