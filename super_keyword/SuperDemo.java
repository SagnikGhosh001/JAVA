package super_keyword;
class parent{
	int x=10;
	public void m1() {
		System.out.println("parent");
	}
}
class Child extends parent{
	int x=20;
	public void m1() {
		System.out.println("child");
	}
	public void display() {
		System.out.println("parent="+super.x+"child="+this.x);
		m1();
		super.m1();
		this.m1();
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		Child c=new Child();
		c.display();
		
	}

}
