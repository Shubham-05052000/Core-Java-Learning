package program_question;

import java.util.Scanner;

public class PrintWeekWithCode {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter a Code");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		switch(a) {
		case 1:System.out.println("Sunday");
		break;
		case 2:System.out.println("Monday");
		break;
		case 3:System.out.println("Tuesday");
		break;
		case 4:System.out.println("Wednesday");
		break;
		case 5:System.out.println("Thrusady");
		break;
		case 6:System.out.println("Friady");
		break;
		case 7:System.out.println("Saturaday");
		break;
		case 8:System.out.println("Invald code");
		}
			
		

	}

}
