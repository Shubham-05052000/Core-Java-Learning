                               // CountDigit_number//

package program_question;

import java.util.Scanner;

public class CountDigit_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, count =0;
		System.out.println("Enter a Number");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		while(a>0) {
			a=a/10;
			count++;
		}
		System.out.println("The Disgit is "+count);
		

	}

}
