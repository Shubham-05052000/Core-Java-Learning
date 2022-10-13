package arraymethod;

import java.util.Scanner;

public class Array_UserSize {

	public static void main(String[] args) {
		int size,i;
		Scanner ref =new Scanner(System.in);
		System.out.println("Enter array Size");
		size=ref.nextInt();
		int a[]=new int[size];
		for(i=0;i<size;i++)
		{
			a[i]=ref.nextInt();
		}
		System.out.println("the array");
		for(i=0;i<size;i++) {	
			System.out.println(a[i]+" ");
		}
		

	}

}
