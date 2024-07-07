package assignment2;

class Threadd1 extends Thread {

	public void run() {
		int i;

		try {
			for (i = 1; i <= 50; i = i + 2) {
				System.out.println(i);

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class Threadd2 extends Thread {

	 public void run() {
		int a;
		try {
			for (a = 2; a <= 50; a = a + 2) {
				System.out.println(a);

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

public class Q13 {

	public static void main(String[] args) {

		Threadd1 t1 = new Threadd1();
		Threadd2 t2 = new Threadd2();

		t1.start();
		t2.start();
	}

}
