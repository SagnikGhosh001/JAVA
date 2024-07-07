package array;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {

		int a[];
		int[] b;
		a = new int[10];
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size:");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}

}
