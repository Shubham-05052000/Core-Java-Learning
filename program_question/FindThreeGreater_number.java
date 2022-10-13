package program_question;

import java.util.Scanner;

public class FindThreeGreater_number {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter a first number");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		System.out.println("Enter a Second number");
		b=ref.nextInt();
		System.out.println("Enter a Third number");
		c=ref.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("greater number is "+a);
			}
			else {
			System.out.println("The Greater Number is "+c);
			}
		}
		else {
			if(b>c) {
				System.out.println("the Greater number is "+b);
			}
			else {
				System.out.println("The Greater Number is "+c);
			}
		}
	}

}
