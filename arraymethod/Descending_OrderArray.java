package arraymethod;

import java.util.Scanner;

public class Descending_OrderArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		int temp;
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter a Array Element");
		for(int i=0;i<a.length;i++) {
			a[i]=ref.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
				

	}

}
