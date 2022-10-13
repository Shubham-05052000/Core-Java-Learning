package program_question;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		int year;
		System.out.println("Enter Year i am Check Year is Leap Year Or Not");
		Scanner ref =new Scanner(System.in);
		year=ref.nextInt();
		if(year%400==0 && year%100==0 || year%100!=0 && year%4==0) {
			System.out.println("leap Year");
		}
		else {
			System.out.println("Not a Leap Year");
		}
	}

}
