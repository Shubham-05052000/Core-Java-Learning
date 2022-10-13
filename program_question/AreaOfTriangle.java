package program_question;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		int a,b,c,sp;
		double Area;
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter First value");
		a=ref.nextInt();
		System.out.println("Enter a Second Value");
		b=ref.nextInt();
		System.out.println("Enter your Third Value");	
		c=ref.nextInt();
		sp=(a*b*c)/2;
		System.out.println("The Semipermeterof Traiangle "+sp);
		Area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
		System.out.println("the area of triangle "+Area);
		
	}
}
