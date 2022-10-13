package array_ststicmethod;

import java.util.Arrays;
import java.util.Scanner;

public class CopyOfMethod {
	public static void main(String[] args) {
		int a[]= new int[5];
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter A Arrays Element");
		for(int i=0;i<a.length;i++) {
			a[i]=ref.nextInt();
		}
		System.out.println("First Arrays");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ "\n");
		}
		int a2[]=Arrays.copyOf(a, 5);
		System.out.println("Second Arrays ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
	}
}
