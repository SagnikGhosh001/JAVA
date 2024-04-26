package tryCatch;

public class ThrowDemo {
	static void validateAge(int age) throws AgevalidationException
	{
	if(age<18)
		throw new AgevalidationException("Age is not valid");
	else {
		System.out.println("age is valid");
	}
		
	}
	
	
	static void validateDivisable(int num)throws DivisableException{
		if(num%5!=0 && num%11!=0)
			throw new DivisableException("Number is not divisable by 5 and 11");
		else {
			System.out.println("Divisable by 5 and 11");
		}
	}
	public static void main(String[] args) {
		
		try {
			validateAge(12);
		}catch (AgevalidationException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			validateDivisable(55);
		} catch (DivisableException e) {
			System.out.println(e.getMessage());
		}
	}

}
