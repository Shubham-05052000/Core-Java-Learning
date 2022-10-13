package decisition_making;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		int a=10, b=10;
		String ch;
//		System.out.println("Enter two Number \n");
		System.out.println("Enter you are choice");
		Scanner ref = new Scanner(System.in);
//		a=ref.nextInt();
//		b=ref.nextInt();
		ch=ref.nextLine();
		switch(ch) {
		case "SUM":System.out.println("sum "+(a+b));
		break;
		case "SUB":System.out.println("sub "+(a-b));
		break;
		case "MUL":System.out.println("mul "+(a*b));
		break;
		case "DIV":System.out.println("div "+(a/b));
		break;
		default :System.out.println("Invaild choise please Enter vaild choice");
		}

	}

}
