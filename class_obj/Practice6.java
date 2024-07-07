package class_obj;

public class Practice6 {
	int a;
	float b;
	public Practice6() {
		a=0;
		b=0.0f;
	}
	public Practice6(int a) {
		this.a=a;
	}
	public Practice6(float b) {
		this.b=b;
	}
	public Practice6(int a,float b) {
		this.a=a;
		this.b=b;
	}
	public Practice6(float b,int a) {
		this.a=a;
		this.b=b;
	}
	void display() {
		System.out.println("a="+a+" b="+b);
	}
	public static void main(String[] args) {
		Practice6 p0=new Practice6();
		Practice6 p1=new Practice6(1);
		Practice6 p2=new Practice6(2.2f);
		Practice6 p3=new Practice6(3,3.1f);
		Practice6 p4=new Practice6(4.1f,4);
		p0.display();
		p1.display();
		p2.display();
		p3.display();
		p4.display();
		
	}

}
