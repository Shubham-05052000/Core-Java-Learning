package program_question;

import java.util.Scanner;

public class CalualtorsUsingLoop {

	public static void main(String[] args) {
		int a,b,c;
		String ch;
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter a First number");
		a=ref.nextInt();
		System.out.println("Enter a Second Number");
		b=ref.nextInt();
		System.out.println("Enter your Operation ");
		ch=ref.next();
		
		
		if(ch.equals("sum"))
		{
			c=a+b;
			System.out.println("the sum of Two number "+c);
		}
		else if(ch.equals("sub"))
		{
			c=a-b;
			System.out.println("the Subtraction of Two number "+c);
		}
		else if(ch.equals("mul"))
		{
			c=a*b;
			System.out.println("the  Multiplation of Two number "+c);
		}
		else if(ch.equals("div"))
		{
			c=a/b;
			System.out.println("The Division is Two Number "+c);
		}
		else {
			
			System.out.println("please Enter vaild Operation ");
		}
		
		

	}

}
