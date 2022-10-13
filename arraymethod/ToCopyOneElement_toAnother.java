package arraymethod;

import java.util.Scanner;

public class ToCopyOneElement_toAnother {

	public static void main(String[] args) {
		int a[]=new int[4];
		int b[]=new int[4];
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter a Element Of Arrays");
		for(int i=0;i<4;i++) {
			a[i]=ref.nextInt();
		}
		System.out.println("first Element Arrays");
		for(int i=0;i<4;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println("Second of Element Arrays");
		for(int i=0;i<4;i++) {
			b[i]=a[i];
			System.out.println(b[i]+ " ");
		}
	}

}
