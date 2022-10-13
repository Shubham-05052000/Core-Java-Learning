package decisition_making;

import java.util.Scanner;

public class If_statement {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter your age");
		Scanner ref = new Scanner(System.in);
		age = ref.nextInt();
		if(age>=18) {
			System.out.println("your are Eligilble for vote ");
		}
		System.out.println("Thanks for enter your ages");
	}

}
