package assignment2;

public class Q3 {
	public final int a=100;
	public final int b;
	
	public Q3(int b) {
		this.b=b;
	}
	public void display() {
		System.out.println("a="+a+" b="+b);
	}
	public static void main(String[] args) {
		Q3 q=new Q3(200);
		q.display();
		//q.a=500;
	}

}
