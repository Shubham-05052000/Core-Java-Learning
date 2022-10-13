package program_question;

import java.util.Scanner;

public class Imp_PalindromeNumber {

	public static void main(String[] args) {
		int a,b,sum=0,r;
		System.out.println("Enter a number ");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		b=a;
		while(a>0) {
			r=a%10;
			sum=(sum*10)+r;
			a=a/10;
		}
		if (b==a) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println(" Not Palindrome Number");
		}

	}

}
