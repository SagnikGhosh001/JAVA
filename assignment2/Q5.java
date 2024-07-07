package assignment2;

class Parent {
	public int a, b;

	Parent(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
class Child extends Parent{
	Child(){
		super(10, 20);
	}
	public void display() {
		System.out.println("a="+a+" b="+b);
	}
}

public class Q5 {

	public static void main(String[] args) {
		Child c=new Child();
		c.display();
	}

}
