package program_question;

import java.util.Scanner;

public class AllOdd_Number {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter a range");
		Scanner ref =new Scanner(System.in);
		a=ref.nextInt();
		for(int i=1;i<=a;i=i+2) {//i=i+2 brcause the odd number is 2 number gap
			for(int j=0;j<=a;j=j+2) {
				System.out.println("the Even Number is "+ j);
			}
			System.out.println("the Odd Number is "+ i);
		}
		

	}

}
