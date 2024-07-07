package polymorphism;

public class MethodOverloading {
	public int add(int num) {
		return num;
	}
	public int add(int a,int b) {
		return a+b;
	}
	public float add(int a,float b,int c,float d) {
		return a+b+c+d;
	}
	public static void main(String[] args) {
		MethodOverloading me=new MethodOverloading();
		System.out.println(me.add(10));
		System.out.println(me.add(10, 10));
		System.out.println(me.add(10, 10.1f, 10, 10.1f));

	}

}
