package tryCatch;

public class TryCatchDemo {

	public static void main(String[] args) {
	try {
		System.out.println(10/0);
	}catch (Exception e) {
		//System.out.println(e.getMessage());
		System.out.println("Div by 0 is not allowed");
	}
		
	
System.out.println("Hello");
	}

}
