package program_question;

import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
		int ch;
		System.out.println("Enter any Ascii key");
		Scanner ref = new Scanner(System.in);
		ch=ref.nextInt();
		//ch=ref.next().charAt(0);
		//int a =ch;// any Ascii value to check syntax 
		char a =(char) ch;// any Ascii value to check syntax 
		System.out.print("The "+ch+ " ascii key value is "+a);

	}

}
