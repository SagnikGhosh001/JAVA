package threading;

public class MyThread implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is runnung");
		
	}

	public static void main(String[] args) {
		MyThread mt=new MyThread();
		Thread t1=new Thread(mt,"Theard-1");
		t1.start();

	}

	

}
