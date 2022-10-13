package decisition_making;

import java.util.Scanner;

public class Elseifladder {
	public static void main(String[] args) {
		int marks;
		System.out.println("Enter you are marks");
		Scanner ref = new Scanner(System.in);
		marks=ref.nextInt();
		if(marks>=80) {
			System.out.println("You are topper");
		}
		else if(marks>=60) {
			System.out.println("you are average");
		}
		else if(marks>=30) {
			System.out.println("you are pass");
		}
		else {
			System.out.println("you are fail");
		}
	}
}
