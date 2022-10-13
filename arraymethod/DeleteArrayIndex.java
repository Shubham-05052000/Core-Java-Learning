package arraymethod;

import java.util.Scanner;

public class DeleteArrayIndex {

	public static void main(String[] args) {
		int size,loc,i;
		System.out.println("Entera Array Size ");
		Scanner ref = new Scanner(System.in);
		size=ref.nextInt();
		
		int a[]=new int[size];
		System.out.println("enter arrays element");
		for(i=0;i<size;i++) {
			a[i]=ref.nextInt();
		}
		System.out.println("Delete index number");
		loc=ref.nextInt();
		for(i=loc;i<size-1;i++) {
			a[i]=a[i+1];
		}
		size--;
		for(i=0;i<size;i++) {
			System.out.println(a[i]+ " ");
		}
		
		

	}

}
