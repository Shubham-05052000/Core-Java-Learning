package program_question;

import java.util.Scanner;

public class Imp_ReverserNumber {

	public static void main(String[] args) {
		int a,r;
		System.out.println("Enter a Code");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		while(a>0) {
			r=a%10;
			System.out.println("Reverser Order "+r);
			a=a/10;
		}

	}

}
