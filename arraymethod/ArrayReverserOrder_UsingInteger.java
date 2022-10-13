package arraymethod;

import java.util.Scanner;

public class ArrayReverserOrder_UsingInteger {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter a Array charcters");
		for(int i=0;i<a.length;i++) {
			a[i]=ref.nextInt();
		}
		System.out.println("Reveser order Charcters ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]+" ");
		}
	}

}
