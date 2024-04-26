package interfaceJava;

interface A{
	void human();
}
interface B extends A{
	void male();
}
interface C extends A{
	void female();
}
class D implements B,C{

	@Override
	public void human() {
		System.out.print("I'm a human & ");
		
	}

	@Override
	public void female() {
		System.out.println("I'm male.");
		
	}

	@Override
	public void male() {
		System.out.println("I'm female.");
		
	}
	
}
public class Diamond {
public static void main(String[] args) {
	D obj = new D();
	obj.human();
	obj.male();
	obj.human();
	obj.female();
}
}