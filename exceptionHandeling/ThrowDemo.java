package exceptionHandeling;

public class ThrowDemo {
	static void validateAge(int a) throws Age{
		if(a<18) {
			throw new Age("under age");
		}
		else {
			System.out.println("ok");
		}
	}
	public static void main(String[] args) {
		try {
			validateAge(15);
		}catch (Age a) {
			System.out.println(a.getMessage());
		}
	}

}
