package inheritance;
class Animal2{
	public void eat() {
		System.out.println("eating...");
	}
}
class Dog2 extends Animal1{
	public void bark() {
		System.out.println("barking..");
	}
}
class Puppy extends Dog2{
	public void walk() {
		System.out.println("walking...");
	}
}
public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		Puppy p=new Puppy();
		p.bark();
		p.eat();
		p.walk();
	}

}
