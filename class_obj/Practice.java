package class_obj;

public class Practice {
	int age=18;
	static int age1=17;
	String name;
	
	public static void main(String[] args) {
		Practice p1=new Practice();
		Practice p2=new Practice();
		Practice p3=new Practice();
		p1.age=19;
		p2.age=20;
		System.out.println(p1.age);
		System.out.println(p2.age);
		System.out.println(p3.age);
		age1=30;
		age1=31;
		System.out.println(age1);
		System.out.println(age1);
		System.out.println(age1);
	}

}
