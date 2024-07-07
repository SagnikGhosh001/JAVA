package assignment2;

public class Q11 {
	static int deposite=1000;
	static void account(int withdraw) throws Bank{
		if(withdraw>deposite) {
			throw new Bank("Not Sufficient Fund");
		}
		else {
			deposite=deposite-withdraw;
			System.out.println(deposite);
		}
	}
	
	public static void main(String[] args) {
		try {
			account(400);
			account(300);
			account(500);
		}catch (Bank e) {
			System.out.println(e.getMessage());
		}
	}
}
