package assignment2;
interface P1{
	int a=10;
	void m1();
}
interface P2{
	int b=20;
	void m2();
}
interface P12 extends P1,P2{
	
}
class Q implements P12{
	public void m1() {
		System.out.println(a);
	}
	public void m2() {
		System.out.println(b);
	}
	
}
public class Q6 {

	public static void main(String[] args) {
		Q q=new Q();
		q.m1();
		q.m2();

	}

}
