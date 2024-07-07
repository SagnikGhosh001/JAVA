package fileHandling;

import java.io.FileOutputStream;

public class Writefile {

	public static void main(String[] args) {
		try {
			FileOutputStream fis=new FileOutputStream("D:\\4TH SEM\\Java code\\java.txt");
//			fis.write(76);
			String s="Hello world";
			byte[] b=s.getBytes();
			fis.write(b);
			fis.close();
			System.out.println("done");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
