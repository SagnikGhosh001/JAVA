package wrapperClass;

public class WrapperDemo {

	
	
	public static void main(String[] args) {
		
		int a=10;
		//Integer i= Integer.valueOf(a);
		//auto boxing
		Integer i=a;
		System.out.println((Object)i.getClass().getName());
		Integer in=new Integer(60);
		int c=in.intValue();
		int j=in;
		System.out.println(j);
	}

}
