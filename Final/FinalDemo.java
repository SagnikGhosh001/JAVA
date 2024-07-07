package Final;
class Bike1{
	final int x=10;
	
	public void colour() {
		System.out.println("red");
	}
	
	public void wheel() {
		System.out.println("4");
	}
	
}
class Pulser extends Bike1{
	public void colour() {
		System.out.println("yellow");
	}
	
	public void wheel() {
		System.out.println("2");
	}
}
public class FinalDemo {
	
	public static void main(String[] args) {
		Pulser p=new Pulser();
		p.colour();
		p.x=10;
		System.out.println(p.x);
	}

}
