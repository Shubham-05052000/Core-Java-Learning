package arraymethod;

import java.util.Scanner;

public class SmallestArrays {

	public static void main(String[] args) {
		int a[]= new int[5];
		int min;
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter A Array Element");
		for(int i=0;i<a.length;i++) {
			a[i]=ref.nextInt();
		}
		min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);

	}

}
