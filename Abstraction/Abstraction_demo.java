package Abstraction;

abstract class A{
	
	public void hello() {
		System.out.println("hello");
	}
	
	public abstract void hi();
	public abstract void abc();
}
abstract class B extends A{
	
	public void hi() {
		System.out.println("hi");
	}
}
class C extends B{
	public void abc() {
		System.out.println("abc");
	}
}
public class Abstraction_demo {

	public static void main(String[] args) {
		C c=new C();
		c.hello();
		c.hi();
		c.abc();
	}

}
