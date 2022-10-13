//a =10 40 28 9 ;
//sort a=9 10 28 40
package array_ststicmethod;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSortMethod {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter array Element ");
		for(int i=0;i<a.length;i++) {
			a[i]=ref.nextInt();
		}
		Arrays.sort(a);
		//System.out.println(Arrays.sort(a));
		System.out.println("Sort method");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		
	}

}
