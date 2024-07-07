package super_keyword;
class A{
	A(){
		System.out.println("From A");
	}
}
class B extends A{
	B(){
		super();
		System.out.println("from B");
		
	}
}
public class SuperConstructor {

	public static void main(String[] args) {
		B b=new B();

	}

}
