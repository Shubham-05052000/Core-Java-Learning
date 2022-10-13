package Recursion;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter a Any Number ");
		Scanner ref = new Scanner(System.in);
		n=ref.nextInt();
		FactorialRecursion obj = new FactorialRecursion();//its instance method
		int result = obj.fact(n);
		System.out.println("The Fcatorial of "+n+" is "+result);
		
	}
	int fact(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}

}
