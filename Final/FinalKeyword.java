package Final;
final class Bike{
	final void color()
	{
		System.out.println("Color is red");
	}
}
public class FinalKeyword extends Bike {//final class cannot be extends
	void color() {//final method cannot be override
		System.out.println("Blue");
	}
	final int speed=100;
	
	public static void main(String[] args) {
		FinalKeyword fd=new FinalKeyword();
		fd.speed=200;//final variable cannot be change
		System.out.println(fd.speed);
		fd.color();
		
	}

}
