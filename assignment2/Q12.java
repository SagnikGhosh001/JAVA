package assignment2;

class Thread1 extends Thread {
	public void run() {
		try {
			while (true) {
				System.out.println("Thread1");
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class Thread2 extends Thread {
	public void run() {
		try {
			while (true) {
				System.out
				.println("Thread2");
				Thread.sleep(4000);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

public class Q12 {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}

}
