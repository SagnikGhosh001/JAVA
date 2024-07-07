package polymorphism;
class Bank{
	public void interest() {
		System.out.println("10% interest");
	}
}
class Sbi extends Bank{
	public void interest() {
		System.out.println("6% interest");
	}
}
class Axix extends Bank{
	public void interest() {
		System.out.println("3% interest");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
//		Sbi s= new Sbi();
//		s.interest();
//		Axix a=new Axix();
//		a.interest();
		Bank bk=new Sbi();//upcasting
		bk.interest();
		bk=new Axix();
		bk.interest();
		
	}

}
