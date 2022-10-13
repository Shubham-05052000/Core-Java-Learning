package program_question;

import java.util.Scanner;

public class AddTwoNumbers {
	public static void main(String args[]) {
		int a, b;
		System.out.println("Enter A two Number");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		b=ref.nextInt();
		System.out.println("the Sum of Two Number  " +(a+b));
	}

}
