package Abstraction;
abstract class Draw{
	public abstract void greet();//abstract method
	public void drawing() {
		System.out.println("Draw a circle");//concrete method
	}
}
class SubDraw extends Draw{
	@Override
	public void greet() {
		System.out.println("Hello Good Morning");
		
	}
}
public class AbstractionDemo {

	public static void main(String[] args) {
//		SubDraw sd=new SubDraw();
//		sd.drawing();
//		sd.greet();
		Draw d=new SubDraw();
		d.drawing();
		d.greet();
	}

}
