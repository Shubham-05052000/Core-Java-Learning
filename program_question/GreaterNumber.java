package program_question;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ,b;
		System.out.print("Enter a Two number");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		b=ref.nextInt();
		if(a>b) {
			System.out.print(a+" is greater tha "+b);
		}
		else {
			System.out.println(b+" is greater tha "+a);
		}

	}

}
