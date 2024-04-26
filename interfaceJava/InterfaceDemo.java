package interfaceJava;

interface Prinnttable{
	void display();
	void fun();
}

class Print implements Prinnttable{
	@Override
	public void display() {
		System.out.println("This is interface");	
	}
	@Override
	public void fun() {
		System.out.println("We are enjoying");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Prinnttable pt=new Print();
		pt.display();
		pt.fun();
	}

}
