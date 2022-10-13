package array_ststicmethod;

import java.util.Arrays;
import java.util.Scanner;

public class EqualsMeethodArrays {

	public static void main(String[] args) {
		int a[]=new int[5];
		int a1[]=new int[5];
		Scanner ref = new Scanner(System.in);
		System.out.println(" Enter A Arrays Element");
		for(int i=0;i<a.length;i++) {
			a[i]=ref.nextInt();
		}
		System.out.println(("Enter a Second Arrays"));
		for(int i=0;i<a1.length;i++) {
			a1[i]=ref.nextInt();
		}
		// its return true aur false then using boolean method 
		boolean b =Arrays.equals(a, a1);
		System.out.println("Both The Array Are Equal "+b);

	}

}
