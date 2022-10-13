package program_question;

import java.util.Scanner;

public class Imp_ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,arm=0,r;
		System.out.println("Enter a number ");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		b=a;
		while(a>0) {
			r=a%10;
			arm=(r*r*r)+arm;
			a=a/10;
		}
		if (b==arm) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println(" Not- Armstrong Number");
		}

	}

}
