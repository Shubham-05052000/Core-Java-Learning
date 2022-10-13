package program_question;

import java.util.Scanner;

public class Imp_SumOfDigit {

	public static void main(String[] args) {
		int a,r,sum=0;
		System.out.println("Enter a Code");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		while(a>0) {
			r=a%10;
			sum=sum+r;
			a=a/10;
		
		}
		System.out.println("Sun of digit "+sum);
	}

}
