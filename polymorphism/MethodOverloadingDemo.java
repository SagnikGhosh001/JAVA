package polymorphism;
class Demo{
	public int sum(int a, int b) {
		return a+b;
	}
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	public float sum(int a, float b) {
		return a+b;
	}
	
}

public class MethodOverloadingDemo {
	public static void main(String[] args) {
		Demo d=new Demo();
		System.out.println(d.sum(1,2));
		System.out.println(d.sum(1,2,3));
		System.out.println(d.sum(1,2.3f));
	}
}
