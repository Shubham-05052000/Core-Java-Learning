package program_question;

import java.util.Scanner;

public class Vowel_Constant {
	public static void main(String[] args) {
		char ch;
		System.out.println("Please enter a Characters");
		Scanner ref = new Scanner(System.in);
		ch=ref.next().charAt(0);
		if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' ||ch=='o' || ch=='O' || ch=='u' || ch=='U') {
			System.out.println(ch+" is Vowel");
		}
		else {
			System.out.println(ch+" is consatant");
		}
	}
}
