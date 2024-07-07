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
class Child2 extends Parent{

} 
public class MethodoverRiddingDemo {

	public static void main(String[] args) {
//		Child c= new Child();
//		c.m1();
//		c.m2();
////		c.m1(4);
////		c.setData(10, 20);
//		Parent p=new Child();
//		p.m1();
//		p.m2();
		
//		Parent p=new Parent();
//		Child c= new Child();
//		Child2 c2= new Child2();
//		c.m1();
//		//c2.m1();
//		p.m1();
		
//		Parent p1=new Child();
//		p1.m1();
		
	}

}
