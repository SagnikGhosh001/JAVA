package assignment2;

public class Q1 {
	
	private int a,b;
	
	public void setData(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public void display() {
		System.out.println("a="+a+" b="+b);
	}
	
	public static void main(String[] args) {
		Q1 q=new Q1();
		q.setData(10, 100);
		q.display();
	}

}
