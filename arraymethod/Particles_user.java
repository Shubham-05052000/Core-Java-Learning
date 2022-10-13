package arraymethod;

import java.util.Scanner;

public class Particles_user {

	public static void main(String[] args) {
		int size,i;
		System.out.println("Enter Arry of Size");
		Scanner ref = new Scanner(System.in);
		size=ref.nextInt();
		int a[]=new int[size];
		for(i=0;i<size;i++) {
			a[i]=ref.nextInt();
		}
		System.out.println("Array ");
		for(i=0;i<size;i++) {
			System.out.println(a[i]+" ");
		}
	}

}
