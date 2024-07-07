package assignment2;

class A{
	public void a() {
		System.out.println("a");
	}
}
class B extends A{
	public void b() {
		System.out.println("b");
	}
}

class C extends B{
	public void c() {
		System.out.println("c");
	}
}
class D extends A{
	public void d() {
		System.out.println("d");
	}
}
public class Q4 {

	public static void main(String[] args) {
		B obj_b=new B();//single inheritance
		obj_b.a();
		obj_b.b();
		C obj_c=new C();//multilevel inheritance
		obj_c.a();
		obj_c.b();
		obj_c.c();
		D obj_d=new D();//hierarchical inheritance
		obj_d.d();
		obj_d.a();
	}

}
