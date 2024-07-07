package fileHandling;

import java.io.FileInputStream;


public class Readfile {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("D:\\4TH SEM\\Java code\\java.txt");
			int i;
			System.out.println("remaining"+fis.available());
			while((i=fis.read())!=-1) {
				System.out.println((char)i);
			}
			//System.out.println(fis.read());//ascii value
			System.out.println("done");
			System.out.println("remaining"+fis.available());
			fis.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
