package program_question;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter a Number");
		Scanner ref = new Scanner(System.in);
		n=ref.nextInt();
		if(n%2==0) {
			System.out.println("you input number is Even");
		}
		else {
			System.out.println("you input Number is Odd");
		}

	}

}
