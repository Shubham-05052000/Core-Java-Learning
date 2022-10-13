package program_question;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		System.out.println("With  Using third variable ");
		int a,b,temp;
		System.out.println("Enter A = ");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		System.out.println("Enter B = ");
		b=ref.nextInt();
		System.out.println("before Swapping The A ="+a+" The B value "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping The A ="+a+" The B value "+b);
		
		
		//WhitOut using third variable
		System.out.println("With out Using third variable ");
		System.out.println("before Swapping The A ="+a+" The B value "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("After Swapping The A ="+a+" The B value "+b);
		
		

	}

}
