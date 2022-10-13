package program_question;

import java.util.Scanner;

public class FindFactors {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter a Code");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.println(i+" ");
			}
			
		}

	}

}
