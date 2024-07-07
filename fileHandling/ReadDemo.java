package fileHandling;

import java.io.FileInputStream;

public class ReadDemo {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("D:\\4TH SEM\\abc.txt");
			int i;
			System.out.println("remaining " + fis.available());
			// System.out.println((char)fis.read());
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			System.out.println("remaining " + fis.available());
			System.out.println(i);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}