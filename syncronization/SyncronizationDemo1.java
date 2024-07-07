package syncronization;

class PrintData1 {
	synchronized public void oddPrint(int i) {
		try {
			for (; i <= 10; i = i + 2) {
				System.out.println(i);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class Threadd1 extends Thread {
	PrintData1 p;

	public Threadd1(PrintData1 p) {
		this.p = p;
	}

	public void run() {
		p.oddPrint(5);
	}
}

class Threadd2 extends Thread {
	PrintData1 p;

	public Threadd2(PrintData1 p) {
		this.p = p;
	}

	public void run() {
		p.oddPrint(4);
	}
}
public class SyncronizationDemo1 {

	public static void main(String[] args) {
		PrintData1 pd = new PrintData1();
		Threadd1 t1 = new Threadd1(pd);
		Threadd2 t2 = new Threadd2(pd);

		t1.start();
		t2.start();

	}

}
