package assignment2;

interface X{
	void m1();
}

interface Y{
	void m2();
}

class Z implements X,Y{
	public void m1() {
		System.out.println("m1");
	}
	public void m2() {
		System.out.println("m2");
	}
}
public class Q8 {

	public static void main(String[] args) {
		Z z=new Z();
		z.m1();
		z.m2();
	}

}
