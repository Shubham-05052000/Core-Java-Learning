package program_question;

import java.util.Scanner;

public class ToCheckDivFive {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter A number I am check to Division % or Not");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		if(a%5==0) {
			System.out.println("Divisiable By 5");
		}
		else {
			System.out.println("Not Divisiable By 5");
		}
	}

}
