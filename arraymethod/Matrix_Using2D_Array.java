package arraymethod;

import java.util.Scanner;

public class Matrix_Using2D_Array {

	public static void main(String[] args) {
		int a[][]=new int[2][2];//first wala raws and second column
		System.out.println("Enter A array element");
		Scanner ref = new Scanner(System.in);
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				a[i][j]=ref.nextInt();
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
		

	}

}
