package program_question;

import java.util.Scanner;

public class ToCheckAllPrime_Number {

	public static void main(String[] args) {
		int a,b,i,j;
		System.out.println("Enter Two Number");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		b=ref.nextInt();
		
		for(i=a;i<=b;i++) {
			for( j=2;j<=i;j++) {
				if(i%j==0)
					break;
			}
			if(i==j)
				System.out.println(j+" ");
		}
	}

}

