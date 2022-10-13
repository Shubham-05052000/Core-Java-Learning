                  //  factorial number //

package program_question;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,fact=1;
		System.out.println("Enter a Number");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		for(int i=1;i<=a;i++)//i=1
		{
			fact=fact*i;//i is increment 
		}
		System.out.println("Factorial "+a+" is " +fact);

	}

}
