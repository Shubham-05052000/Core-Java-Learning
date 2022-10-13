package arraymethod;

import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		int a[]=new int[5];
		System.out.println("Enter element In Arrays");
		Scanner ref = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=ref.nextInt();
		}
		System.out.println("reverse Order Array");
		for(int i=a.length-1;i>=0;i--) {///ararys reveser order syntax
			System.out.println(a[i]+" ");
		}

	}

}
