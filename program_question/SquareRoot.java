package program_question;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter a Number");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		double squareroot=Math.sqrt(a);
		System.out.println("the squareroot "+a+ " is "+squareroot);
	}

}
