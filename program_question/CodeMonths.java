package program_question;

import java.util.Scanner;

public class CodeMonths {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter a Code");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		if(a==1)
		{
			System.out.println("jan 31 day");
		}
		else if(a==2)
		{
			System.out.println("feb 29 day");
		}
		else if(a==3)
		{
			System.out.println("march 31 day");
		}
		else if(a==4)
		{
			System.out.println("april 30 day");
		}
		else if(a==5)
		{
			System.out.println("may 31 day");
		}
		else if(a==6)
		{
			System.out.println("june 30 day");
		}
		else if(a==7)
		{
			System.out.println("july 31 day");
		}
		else if(a==8)
		{
			System.out.println("august 31 day");
		}
		else if(a==9)
		{
			System.out.println("Setember 30 day");
		}
		else if(a==10)
		{
			System.out.println("October 31 day");
		}
		else if(a==11)
		{
			System.out.println("November 30 day");
		}
		else if(a==12)
		{
			System.out.println("December 31 day");
		}
		else {
			System.out.println("inavlaid Code plese Enter valid Code");
		}
	}

}
