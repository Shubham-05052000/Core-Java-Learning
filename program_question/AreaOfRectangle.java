package program_question;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter length value");
		Scanner ref =new Scanner(System.in);
		a=ref.nextInt();
		System.out.println("Enter Breath Value");
		b=ref.nextInt();
		c=a*b;
		System.out.println("the area of Rectangle is "+c);
		

	}

}
