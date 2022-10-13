package operators;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		System.out.println("enter a number");
		int a, b;
		a=ref.nextInt();
		b=ref.nextInt();
		System.out.println(a+ " is greater than "+b+" "+(a>b));
		System.out.println(a+ " is Smaller than "+b+" "+(a<b));
		System.out.println(a+ " is greater equalto than "+b+" "+(a>=b));
		System.out.println(a+ " is less equaltor than "+b+" "+(a<=b));
		System.out.println(a+ " is equa to "+b+" "+(a==b));
		System.out.println(a+ " is not equal to "+b+" "+(a!=b));
		

	}

}
