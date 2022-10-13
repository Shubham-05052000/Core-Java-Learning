package program_question;

import java.util.Scanner;

public class CalculatePowerOfNumber {
	public static void main(String[] args) {
		//first methout without loop
//		int a;
//		System.out.println("Enter a Number");
//		Scanner ref = new Scanner(System.in);
//		a=ref.nextInt();
//		a*=a;
//		System.out.print("the square root of "+a);
		
		
		// second method with loop
		int a,b,result =1;//result 1 because you doing multiple
		System.out.println("Enter a number");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		System.out.println("Enter a power");
		b=ref.nextInt();
		for(int i=1;i<=b;i++) {//b is the power of number is loop you put 3 then a is multiple 3
			result=a*result;//the multiple 3 is store result
		}
		System.out.println("the Power of Result " + result);
		
	}

}
