package newKeyword;

import java.util.Scanner;

public class ArrayNewkeyword {
	public static void main(String[] args) {
		int size;
		System.out.println("enter a arrays Size");
		Scanner ref = new Scanner(System.in);
		size = ref.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Arrays Elements");
		for(int i=0;i<size;i++) {
			a[i]=ref.nextInt();
		}
		System.out.println("the Arrays Elements ");
		for(int i=0;i<size;i++) {
			System.out.println(a[i]+" ");
		}
	}
}
