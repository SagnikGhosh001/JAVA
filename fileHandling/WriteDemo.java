package fileHandling;

import java.io.FileOutputStream;

public class WriteDemo {

	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream("D:\\4TH SEM\\xyz.txt");
			//fos.write(56);
			String s="sagnik";
			byte b[]=s.getBytes();
			fos.write(b);
			System.out.println("done");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
