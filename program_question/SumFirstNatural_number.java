package program_question;

import java.util.Scanner;

public class SumFirstNatural_number {

	public static void main(String[] args) {
		int n, sum =0;
		System.out.println("Enter a Number");
		Scanner ref = new Scanner(System.in);
		n=ref.nextInt();
		for (int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("Adding of Ntural number " +sum);
	}

}
