package arraymethod;

import java.util.Scanner;

public class Addition_Of_Two_Matrix {

	public static void main(String[] args) {
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		System.out.println("Enter a First Element");
		Scanner ref = new Scanner(System.in);
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				a[i][j]=ref.nextInt();
			}
		}
		System.out.println("First Array");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(a[i][j]+" ");
			}
		}
		System.out.println("\n");
		System.out.print("Enter A second Array");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				b[i][j]=ref.nextInt();
			}
		}
		System.out.println("second Array");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(b[i][j]+" ");
			}
		}
		System.out.print("\n");
		System.out.println("Addition of two Array");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
		}
		System.out.print("\n");
	}

}
