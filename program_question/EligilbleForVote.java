package program_question;

import java.util.Scanner;

public class EligilbleForVote {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter your Age ");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		if(a>=18)
		{
			System.out.println("Your Eligible for Vote");
		}
		else 
		{
			System.out.println("Your are Minor not for vote ");
		}
		
		
	}

}
