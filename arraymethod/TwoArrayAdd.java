package arraymethod;

import java.util.Scanner;

public class TwoArrayAdd {
	public static void main(String[] args) {
		int a[]=new int [3];
		int b[]=new int [5];
		int c[];
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter first element of arrays");
		for(int i=0;i<a.length;i++) {
			a[i]=ref.nextInt();
		}
		System.out.println("Enter Second element of arrays");
		for(int i=0;i<a.length;i++) {
			b[i]=ref.nextInt();
		}
		System.out.println("First Array Element");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("Second Array Element");
		for(int i=0;i<b.length;i++)	{
			System.out.print(+b[i]+" ");
		}
			
		System.out.println("Add of arry two Element");
		for(int i=0;i<3;i++) {
			int c[]=a[i]+b[i];
			System.out.println("the second arrays"+c[i]+" ");
		}
	}
}
