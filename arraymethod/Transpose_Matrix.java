package arraymethod;

import java.util.Scanner;

public class Transpose_Matrix {

	public static void main(String[] args) {
		int a[][]= new int[2][2];
		Scanner ref =  new Scanner(System.in);
		System.out.println("Enter a array Element");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				a[i][j]=ref.nextInt();
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(a[i][j]+" ");
			}
		}
		System.out.print("\n");
		System.out.println("transpose array");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(a[j][i]+" ");
			}
		}
		System.out.print("\n");
		

	}

}
