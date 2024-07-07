package assignment2;

import java.util.Scanner;

public class Q10 {
	
	static void user (int n,int d) throws DivideZero{
		if(d==0) {
			throw new DivideZero("divided by zero error");
		}
		System.out.println(n/d);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,d;
		System.out.print("Enter numerator:-");
		n=sc.nextInt();
		System.out.print("Enter denominator");
		d=sc.nextInt();
		try {
			user(n,d);
		}catch (DivideZero e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
