package assignment2;

import assignment2_helper.Q7_helper;

class Daughter extends Father {
	public void boy() {
		System.out.println("Daughter");
	}
}

class Mother extends Q7_helper {
	public void m1_helper() {
		System.out.println("m1");
	}
}

public class Q7 {
	public static void main(String[] args) {
		Daughter d = new Daughter();// method override same package
		d.boy();
		Mother m =new Mother();
		m.m1_helper();
	}

}
