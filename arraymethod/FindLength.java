package arraymethod;

import java.util.Scanner;

public class FindLength {

	public static void main(String[] args) {
		int a[] = new int[3];
		Scanner ref = new Scanner(System.in);
		System.out.println("enter Array Element");
		for(int i =0;i<3;i++) {
			a[i]=ref.nextInt();
		}
		System.out.println("Array Element");
		for(int i=0;i<3;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println("the length of array Elemnt "+a.length);
		
		

	}

}
