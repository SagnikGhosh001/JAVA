package inheritance;
class Human{
	public void walk() {
		System.out.println("walking...");
	}
}
class Boy extends Human{
	public void play() {
		System.out.println("playing");
	}
}
class Girl extends Human{
	public void weep() {
		System.out.println("weeping...");
	}
}
public class Hierarchaicalinheritance {

	public static void main(String[] args) {
		Boy b=new Boy();
		b.play();
		b.walk();
		Girl g=new Girl();
		g.walk();
		g.weep();
	}

}
