package fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copyfile {
	public static void main(String[] args) {
		try {
			FileOutputStream out=new FileOutputStream("D:\\4TH SEM\\Java code\\destination.txt");
			FileInputStream in=new FileInputStream("D:\\4TH SEM\\Java code\\source.txt");
			int i;
			while((i=in.read())!=-1) {
				out.write(i);
			}
			in.close();
			out.close();
			System.out.println("done");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
