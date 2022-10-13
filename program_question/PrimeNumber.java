package program_question;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,count=0;
		System.out.println("Enter a Number ");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
			if(count==2) {
				System.out.println("prime number");
			}
			else {
				System.out.println("not Prime");
			}
		}
	}

}
