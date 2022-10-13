package arraymethod;

import java.util.Scanner;

public class SumofArrayElement {

	public static void main(String[] args) {
		int a[]=new int [5];
		int sum=0;
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter a element of arrays");
		for(int i=0;i<a.length;i++) {
			a[i]=ref.nextInt();
		}
		System.out.println("the  array element ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
			sum=a[i]+sum;
		}
		System.out.println("the sum of array element "+sum);
				
	}

}
