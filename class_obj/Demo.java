package class_obj;

public class Demo{
	public int roll=9;
	public String name="Sanchita";
	public static int id=100;
	
	public static void main(String[] args) {
		Demo d1=new Demo();
		Demo d2=new Demo();
		d1.roll=7;
		d1.name="Sagnik";
		d1.id=101;
		System.out.println(d1.roll);
		System.out.println(d1.name);
		System.out.println(id);
		
		System.out.println(d2.roll);
		System.out.println(d2.name);
		System.out.println(id);
	}
}
