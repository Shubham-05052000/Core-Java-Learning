package program_question;

import java.util.Scanner;

public class FirstNatural_Number {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter a Number");
		Scanner ref = new Scanner(System.in);
		n=ref.nextInt();
		for (int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}

}
