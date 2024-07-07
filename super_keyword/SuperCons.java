package super_keyword;
class X{
	X(int i,int j){
		System.out.println(i);
		System.out.println(j);
		System.out.println("2 arg");
	}
}
class Y extends X{
	Y(int i){
		super(2,6);
		System.out.println(i);
		System.out.println("1 arg");
	}
}
public class SuperCons {

	public static void main(String[] args) {
		Y y=new Y(12);
	}

}
