package program_question;

import java.util.Scanner;

public class ConvertUpperLower_Case {

	public static void main(String[] args) {
		char ch,ch1;
		System.out.println("Enter any Charactertics");
		Scanner ref = new Scanner(System.in);
		ch=ref.next().charAt(0);
		if(ch>='A' && ch<='Z') {
			ch1=Character.toLowerCase(ch);
			System.out.println("Lower Case "+ch1);
		}
		else {
			ch1=Character.toUpperCase(ch);
			System.out.println("Upper Case "+ch1);
		}

	}

}
