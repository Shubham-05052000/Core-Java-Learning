package program_question;

import java.util.Scanner;

public class ToCheckPostiveNegative {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter a number");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		if(a>0) {
			System.out.println("The number is Postive Number");
		}
		else if(a==0){
			System.out.println("the number is Zero");
		}
		else {
			System.out.println("The Number is Neagtive");
		}
	}

}
