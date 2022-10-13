package program_question;

import java.util.Scanner;

public class SumOfAllOddEven_Number {

	public static void main(String[] args) {
		int a,i,sum=0;
		System.out.println("Enter a range");
		Scanner ref =new Scanner(System.in);
		a=ref.nextInt();
		if(a%2==0) {
			for( i=0;i<=a;i=i+2) {
				sum=sum+i;
			}
			System.out.println("Sum of all Even number "+sum);
		}
		else {
			for(i=1;i<=a;i=i+2) {
				sum=sum+i;
			}
			System.out.println("Sum of all odd number "+sum);
		}
	}

}
