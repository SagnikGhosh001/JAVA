package assignment2;

public class Q2 {
	
	private int a,b;
	
	public Q2() {
		this.a=10;
		this.b=20;
	}
	
	public Q2(int b) {
		this.a=40;
		this.b=b;
	}
	
	public Q2(Q2 example) {
		this.a=example.a;
		this.b=example.b;
	}
	
	public void display() {
		System.out.println("a="+a+" b="+b);
	}
	public static void main(String[] args) {
		Q2 q1=new Q2();
		q1.display();
		Q2 q2=new Q2(50);
		q2.display();
		Q2 q3=new Q2(q2);
		q3.display();
	}

}
