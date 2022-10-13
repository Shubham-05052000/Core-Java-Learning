// 0 1 1 2 3 5
// a=0 b=1 a+b=c//eg 0+1=1,1+1=2,1+2=3
package program_question;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int term,a=0,b=1,c;
		System.out.println("Enter term ");
		Scanner ref = new Scanner(System.in);
		term=ref.nextInt();
		for(int i=1;i<=term;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}
