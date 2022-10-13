//sort method
// n=10 20 30 60 40
//output n=10 20 30 40 60
package arraymethod;

import java.util.Scanner;

public class Sort_AccesdingOrder {

	public static void main(String[] args) {
		int a[]=new int[5];
		int temp;
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter Array Element");
		for(int i=0;i<a.length;i++) {
			a[i]=ref.nextInt();
		}
		System.out.println("The Array element");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
				}
			}
		System.out.println("sort array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
