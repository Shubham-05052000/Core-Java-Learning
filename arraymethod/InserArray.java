package arraymethod;

import java.util.Scanner;

public class InserArray {

	public static void main(String[] args) {
		int size,item,loc,i;
		Scanner ref=new Scanner(System.in);
		System.out.print("Enter Arrays Size");
		size=ref.nextInt();
		
		int a[]= new int[size];
		System.out.println("enter array element");
		for(i=0;i<size;i++) {
			a[i]=ref.nextInt();
		}
		System.out.println("Enter  loction");
		loc=ref.nextInt();
		System.out.println("Enter insert item");
		item=ref.nextInt();
		
		fo(i=size;i>loc;i--) {
			a[i]=a[i-1];
		}
		a[loc]=item;
		size++;
		for(i=0;i<size;i++) {
			System.out.println(a[i]+" ");
		}
		
	}

}
