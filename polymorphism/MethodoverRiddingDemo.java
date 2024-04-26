package polymorphism;
class Parent{
	public int i;
	public int j;
	
	public void m1() {
		System.out.println("m1 from parent");
	}
	public void m2() {
		System.out.println("m2 from parent");
	}
}
class Child extends Parent{
	public void m1() {
		System.out.println("m1 from child");
	}
	public void setData(int i,int j) {
		this.i=i;
		this.j=j;
	}
}
public class MethodoverRiddingDemo {

	public static void main(String[] args) {
		Child c= new Child();
		c.m1();
		c.m2();
//		c.m1(4);
//		c.setData(10, 20);
		Parent p=new Child();
		p.m1();
		p.m2();
	}

}
