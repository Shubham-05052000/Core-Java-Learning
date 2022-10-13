package program_question;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,area;
		System.out.println("Enter a Side");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		area=a*a;
		System.out.println("The Area of Square is  "+area);

	}

}
